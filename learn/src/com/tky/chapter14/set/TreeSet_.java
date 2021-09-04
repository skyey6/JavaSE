package com.tky.chapter14.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/4 18:44
 */
public class TreeSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
        //2. 老师希望添加的元素，按照字符串大小来排序
        //3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器 Comparator(匿名内部类)
        //      并指定排序规则
        /*
            public TreeSet(Comparator<? super E> comparator) {
                this(new TreeMap<>(comparator));
            }
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
         */
        //4. 简单看看源码
        /*
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator;
            if (cpr != null) {
                do {
                    parent = t;
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else
                        return t.setValue(value);
                } while (t != null);
            }
         */

        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的 compareTo 进行比较
                return ((String) o2).compareTo((String) o1);
                //如果compare的返回值为0，则新的值不会加入treeSet中
            }
        });
        //添加数据
        treeSet1.add("jack");
        treeSet1.add("tom");//3
        treeSet1.add("sp");
        treeSet1.add("a");
        treeSet1.add("abc");//3
        System.out.println("treeSet1=" + treeSet1);


        TreeSet treeSet2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的 compareTo 进行比较
                return ((String) o2).length() - ((String) o1).length();
                //如果compare的返回值为0，则新的值不会加入treeSet中
            }
        });
        //添加数据
        treeSet2.add("jack");
        treeSet2.add("tom");//3
        treeSet2.add("sp");
        treeSet2.add("a");
        treeSet2.add("abc");//3
        System.out.println("treeSet2=" + treeSet2);

    }
}
