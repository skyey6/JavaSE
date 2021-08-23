package com.tky.chapter13.string;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 14:47
 */
public class StringMethod02 {
    public static void main(String[] args) {
        // 1.toUpperCase 转换成大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());//HELLO

        // 2.toLowerCase
        System.out.println(s.toLowerCase());//hello

        // 3.concat 拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗");
        System.out.println(s1);//宝玉林黛玉薛宝钗

        // 4.replace 替换字符串中的字符
        s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
        //在 s1 中，将 所有的 林黛玉 替换成薛宝钗
        System.out.println(s1.replace("林黛玉", "薛宝钗"));
        // s1.replace() 方法执行后，返回的结果才是替换过的.对原本的 s1 没有任何影响
        String s2 = s1.replace("宝玉", "jack");
        System.out.println(s1);//宝玉 and 林黛玉 林黛玉 林黛玉
        System.out.println(s2);//jack and 林黛玉 林黛玉 林黛玉

        // 5.split 分割字符串, 对于某些分割字符，我们需要 转义比如 | \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        // 1. 以 , 为标准对 poem 进行分割 , 返回一个String数组
        // 2. 在对字符串进行分割时，如果有特殊字符，需要加入 转义符 \
        String[] strings = poem.split(",");
//        for (String string : strings) {
//            System.out.println(string);
//        }
        poem = "E:\\aaa\\bbb";
        strings = poem.split("\\\\");
//        for (String string : strings) {
//            System.out.println(string);
//        }

        // 6.toCharArray 转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            System.out.print(ch + " ");
        }

        // 7.compareTo 比较两个字符串的大小，如果前者大，则返回正数，
        // 后者大，则返回负数，如果相等，返回 0
        // (1) 如果长度相同，并且每个字符也相同，就返回 0
        // (2) 如果长度相同或者不相同，但是在进行比较时，可以区分大小
        // 就返回 if (c1 != c2) {
        //          return c1 - c2;
        //       }
        // (3) 如果前面的部分都相同，就返回 str1.len - str2.len
        // 可以看源码
        String a = "jcck";
        String b = "jack";
        System.out.println(a.compareTo(b)); // 返回值是 'c' - 'a' = 2 的值

        // 8.format 格式字符串
        /* 占位符有:
         *  %s 字符串
         *  %c 字符
         *  %d 整型
         *  %.2f 浮点型(保留小数点后两位)
         */
        String name = "john";
        int age = 10;
        double score = 56.857;
        char gender = '男';
        String formatStr = "我的姓名是%s 年龄是%d，成绩是%.2f 性别是%c";
        String info2 = String.format(formatStr, name, age, score, gender);
        System.out.println("info2=" + info2);

    }
}
