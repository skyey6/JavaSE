package com.tky.chapter13.date;

import java.util.Calendar;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 14:34
 */
public class Calendar_ {
    public static void main(String[] args) {
        //1. Calendar 是一个抽象类， 并且构造器是 private
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员
        //4. Calendar 没有提供对应的格式化的类，因此需要程序员自己组合来输出(灵活)
        //5. 如果我们需要按照 24 小时进制来获取时间，Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY

        //Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
        //Calendar 返回月份时候，是从 0 开始编号的，需要 +1
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH)+1) + "-"
                +c.get(Calendar.DAY_OF_MONTH) + " "+c.get(Calendar.HOUR_OF_DAY)+":"
                +c.get(Calendar.MINUTE) + ":"+c.get(Calendar.SECOND));

    }
}
