import java.util.*;

class system implements Runnable {
    static int ticket = 100000;
    int tStation;
    Thread t;

    system(String name) {
        tStation = 0;
        t = new Thread(this, name);
        t.start();
    }

    private synchronized static boolean pickTicket() {
        if (ticket > 0) {
            ticket--;
            return true;
        } else
            return false;
    }

    public void run() {
        while (pickTicket() == true) {
            tStation++;
            System.out.println(t.getName() + "目前有" + tStation + "張票");
        }
        System.out.println(t.getName() + "共拿到" + tStation + "張票");
    }
}

class hw0929 {

    public static void main(String[] args) {
        system s1 = new system("station 1");
        system s2 = new system("station 2");
        system s3 = new system("station 3");
        system s4 = new system("station 4");
    }
}
