/**
 * @author tky
 * @version 1.0
 */
class Hello {
    public static void main(String[]args){
        /*
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
        System.out.println(5.12e2);     // 5.12*10^2
        System.out.println(5.12e-2);    // 5.12*10^-2
        char c1 = 97;
        System.out.println(c1);
        char c2 = 38889;
        System.out.println(c2);
         */
        int n2 = (byte)2000;
        System.out.println("n2=" + n2);

        System.out.println("11" + "5");

        System.out.println("123" instanceof String);

        int a = 10;
        int b = 99;
        int c = 76;
        int res = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("最大数：" + res);

        System.out.println(~-2);    // 1
        // 2的补码：00000000 00000000 00000000 00000010
        // 按位取反：11111111 11111111 11111111 11111101
        // 得到一个负数，再取补码：10000000 00000000 00000000 00000011
        System.out.println(~2);     // -3

        // -1：10000000 00000000 00000000 00000001
        // -1的补码：11111111 11111111 11111111 11111111
        // 右移2位：00111111 11111111 11111111 11111111
        // 去补码：
        System.out.println(-1>>2);

    }
}
