package com.tky.chapter14.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/5 16:31
 */
public class Homework03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put("jack", 650);
        hm.put("tom", 1200);
        hm.put("smith", 2900);

        //将jack的工资更改为2600元
        hm.put("jack", 2600);

        //为所有员工工资涨100元
        for (Object o : hm.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            int oldSal = (Integer) entry.getValue();
            entry.setValue(oldSal + 100);
        }

        System.out.println(hm);

        //遍历所有员工
        for (Object o : hm.keySet()) {
            System.out.println(o + "=" + hm.get(o));
        }

    }
}

