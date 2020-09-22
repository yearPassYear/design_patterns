package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:38
 * @desc   dclģʽ������˫�ؼ���У�飬Ч�ʸߣ��̰߳�ȫ
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
