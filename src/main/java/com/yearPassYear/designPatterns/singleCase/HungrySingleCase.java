package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:36
 * @desc 饿汉式单例  ：类加载时初始化  ，线程安全但是浪费资源
 */
public class HungrySingleCase {
    private HungrySingleCase(){
    }

    private static HungrySingleCase hungrySingleCase = new HungrySingleCase();

    public HungrySingleCase getInstance(){
        return hungrySingleCase ;
    }


}
