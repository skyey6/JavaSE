package com.tky.chapter10.final_;

public class FinalExercise02 {
    public int addOne(final int x) { //下面的代码是否有误，为什么?
//        ++x; //错误,原因是不能修改 final x 的值
        return x + 1; //这里是可以.
    }
}

