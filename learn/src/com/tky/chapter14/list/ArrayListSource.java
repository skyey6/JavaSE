package com.tky.chapter14.list;

import java.util.ArrayList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/26 17:42
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //使用无参构造器创建 ArrayList 对象
        ArrayList list = new ArrayList(); //elementData 容量为0

        //使用 for 给 list 集合添加 1-10 数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        //加入第11个数据，数组容量用完，自动扩容
        list.add(11);

//        System.out.println(list.size());





    }
}
