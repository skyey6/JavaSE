package com.tky.chapter13.stringbuffer;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 16:23
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");

        //增
        sb.append(",");
        sb.append("张三丰");
        sb.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(sb); //hello,张三丰赵敏100true10.5

        //删
        /*
            删除索引为 11~14 的字符 [11, 14)
         */
        sb.delete(11,14);
        System.out.println(sb); //hello,张三丰赵敏true10.5

        //改
        //使用 芜湖蚌埠 替换 索引为 9-11 的字符 [9,11)
        sb.replace(9,11,"芜湖蚌埠");
        System.out.println(sb); //hello,张三丰芜湖蚌埠true10.5

        //查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        System.out.println(sb.indexOf("芜湖")); //9

        //插
        sb.insert(6, "赵敏");
        System.out.println(sb); //hello,赵敏张三丰芜湖蚌埠true10.5

        //长度
        System.out.println(sb.length()); //23
    }
}
