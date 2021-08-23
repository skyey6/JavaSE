package com.tky.chapter13.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/23 20:41
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 346};

        //二分查找，需要数组有序
        int index = Arrays.binarySearch(arr, 123);
        System.out.println(index); //3
        //如果数组中不存在该元素， return -(low + 1); // key not found
        index = Arrays.binarySearch(arr, 88);
        System.out.println(index); //-3

        //copyOf 数组元素的复制
        // 1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
        // 2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加对应数据类型的初始值
        // 3. 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
        // 4. 该方法的底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, arr.length+2);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num, 99);
        System.out.println("==num数组填充后==");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1, 2, 90, 123};
        System.out.println(Arrays.equals(arr, arr2));

        //asList 将一组值，转换成 List
        //1. asList 方法，会将 (2,3,4,5,6,1)数据转成一个 List 集合
        //2. 返回的 asList 编译类型 List(接口)
        //3. asList 的运行类型: java.util.Arrays$ArrayList, 是 Arrays 类的
        //      静态内部类 private static class ArrayList<E> extends AbstractList<E>
        //                  implements RandomAccess, java.io.Serializable
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("list=" + list);
        System.out.println("asList 的运行类型" + list.getClass());

    }
}
