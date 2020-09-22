package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:41
 * @desc 静态内部类实现单例,高效且线程安全
 */
public class StaticInnerClassSingleCase {

    private static class StaticInnerClassSingleCaseHolder{
        private final static StaticInnerClassSingleCase instance = new StaticInnerClassSingleCase();
    }

    private StaticInnerClassSingleCase(){

    }

    public StaticInnerClassSingleCase getInstance(){
        return StaticInnerClassSingleCaseHolder.instance ;
    }

}
