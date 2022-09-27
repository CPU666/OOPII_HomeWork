import java.util.*;

public class hw20922 {
    public static void main(String[] args) {
        HashMap map = new HashMap<Integer, String>();
        map.put(1, "January");
        map.put(2, "Febuary");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        System.out.print("請輸入1~12 ? ");
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();

        if (num < 1 || num > 12)
            System.out.println("範圍錯誤!");
        else
            System.out.println("第 " + num + " 月的英文單字為 " + map.get(num));
    }
}