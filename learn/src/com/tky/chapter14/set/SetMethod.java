package com.tky.chapter14.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/27 20:32
 */
public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        //3. set 接口对象存放数据是无序的(即添加的顺序和取出的顺序不一致)
        //4. 取出的顺序虽然与添加的顺序可能不一致，但是他是固定的.

        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john"); //重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);
        set.add(null); //再次添加 null

        System.out.println("set = " + set);

        //删除
        set.remove("mary");
        System.out.println("set = " + set);

        //遍历
        //方式1
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            System.out.print(o + " ");
        }

        System.out.println();
        //方式2
        for (Object o : set) {
            System.out.print(o + " ");
        }
    }
}
