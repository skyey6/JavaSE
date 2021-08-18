package com.tky.chapter10.abstract_;

public abstract class Template {

    public abstract void job(); //执行某种任务

    public void calculateTime() {
        long startTime = System.currentTimeMillis(); //记录开始时间
        job();  //动态绑定机制，调用对应子类的job方法
        long finishTime = System.currentTimeMillis(); //记录结束时间
        System.out.println("执行用时：" + (finishTime - startTime) + "ms");
    }
}
