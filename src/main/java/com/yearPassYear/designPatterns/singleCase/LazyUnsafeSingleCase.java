package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:28
 * @desc  懒汉式线程不安全单例，效率高但是线程不安全
 */
public class LazyUnsafeSingleCase {

    private LazyUnsafeSingleCase(){
    }

    public static LazyUnsafeSingleCase lazyUnsafeSingleCase;

    LazyUnsafeSingleCase getInstance(){
        if(lazyUnsafeSingleCase == null){
            lazyUnsafeSingleCase = new LazyUnsafeSingleCase();
        }
        return lazyUnsafeSingleCase ;
    }


}
