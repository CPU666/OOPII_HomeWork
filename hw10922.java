import java.util.*;

public class hw10922 {
    public static void main(String[] args) {

        var treeSet = new TreeSet<>();
        Random random = new Random();

        System.out.println("電腦從 1~100 的整數中，亂數取出10個不重複的號碼....");

        while (treeSet.size() < 10) {
            int num = random.nextInt(101);

            if (num == 0 || treeSet.contains(num))
                continue;
            else
                treeSet.add(num);
            System.out.println("第 " + treeSet.size() + " 個號碼: " + num);
        }

        System.out.println("物件內元素個數為 : " + treeSet.size());
        System.out.println("物件內元素的內容 : " + treeSet);
        System.out.println("第一個元素內容為 : " + treeSet.first());
        System.out.println("最後一個元素內容為 : " + treeSet.last());
        System.out.println("內容介於30~70者 : " + treeSet.subSet(30, 70));
    }

}