package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:38
 * @desc   dcl模式单例，双重加锁校验，效率高，线程安全
 */
public class DCLSingleCase {

    private DCLSingleCase(){
    }

    public static DCLSingleCase dclSingleCase;

    public  synchronized  DCLSingleCase getInstance(){
        if(dclSingleCase == null){
            synchronized (DCLSingleCase.class){
               if(dclSingleCase == null ){
                   dclSingleCase = new DCLSingleCase();
               }
            }
        }
        return dclSingleCase ;
    }
}
