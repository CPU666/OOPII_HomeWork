import java.util.concurrent.RunnableFuture;

class goldClass implements Runnable {
    /*
     * int m;
     * myThread(int a)
     * {
     * m=a;
     * }
     * 
     * public void run(){
     * for(int i=1;i<=m;i++)
     * {
     * System.out.println(Thread.currentThread().getName()+": "+i);
     * }
     * }
     */

    static int gold = 2000000;
    int tGold;
    Thread t;

    goldClass(String name) {
        tGold = 0;
        t = new Thread(this, name);
        t.start();
    }

    private synchronized static boolean grabGold() {
        if (gold > 0) {
            gold--;
            return true;
        } else
            return false;
    }

    public void run() {
        while (grabGold() == true) {
            tGold++;
        }
        System.out.println(t.getName() + "共偷到" + tGold + "個金幣");
    }
}

public class oop09292 {
    /*
     * public static void main(String[] args) {
     * myThread ta = new myThread(20);
     * myThread tb = new myThread(25);
     * Thread a= new Thread(ta);
     * Thread b = new Thread(tb);
     * a.start();
     * b.start();
     * }
     */
    public static void main(String[] args) {
        goldClass ta = new goldClass("小偷a");
        goldClass tb = new goldClass("小偷b");
        goldClass tc = new goldClass("小偷c");
    }
}