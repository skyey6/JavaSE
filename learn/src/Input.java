import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入内容：");
//        if (sc.hasNextLine()) {
//            String str = sc.nextLine();
//            System.out.println("输入的内容为：" + str);
//        }
        if (sc.hasNext()) {
            String str = sc.next();
            System.out.println("输入的内容为：" + str);
        }
    }
}
