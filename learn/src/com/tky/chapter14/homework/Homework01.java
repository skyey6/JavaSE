package com.tky.chapter14.homework;

import java.util.ArrayList;

/**
 * @author tky
 * @version 1.0
 * @date 2021/9/4 20:58
 */
public class Homework01 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧",""));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生",""));

        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            News news = (News) arrayList.get(i);
            String title = news.getTitle();
            System.out.println(processTitle(title));
        }
    }

    public static String processTitle(String title) {
        if (title == null || title == "")
            return "";
        if (title.length() > 15){
            String newTitle = title.substring(0, 15) + "..."; //[0,15)
            return newTitle;
        }
        return title;
    }
}

class News {
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
