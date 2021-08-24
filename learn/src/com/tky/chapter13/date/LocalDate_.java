package com.tky.chapter13.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author tky
 * @version 1.0
 * @date 2021/8/24 15:03
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        /*
         * 如果只关心日期，可以使用 LocalDate
         * 如果只关心时间，可以使用 LocalTime
         */

        //1. 使用 now() 返回表示当前日期时间的 LocalDateTime 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //2. 使用 DateTimeFormatter 对象来进行格式化
        //创建 DateTimeFormatter 对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
        System.out.println(dtf.format(ldt));

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonthValue() + " or " + ldt.getMonth());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);

        LocalDate localDate = date.plusMonths(2).minusDays(10);
        System.out.println(localDate);
    }
}
