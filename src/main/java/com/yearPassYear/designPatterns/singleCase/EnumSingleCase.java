package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:48
 * @desc  简洁，避免多线程同步问题，自动支持序列化 ,绝对防止多次实例化
 */
public enum EnumSingleCase {
    INSTANCE ;
    public void whateverMethod(){

    }
}
