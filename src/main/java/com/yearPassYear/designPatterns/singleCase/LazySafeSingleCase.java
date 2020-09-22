package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:30
 * @desc  ����ʽ�̰߳�ȫ����   ����Ч�ʵ���
 */
public class LazySafeSingleCase {

    private LazySafeSingleCase(){
    }

    public static LazySafeSingleCase lazySafeSingleCase;

    public  synchronized  LazySafeSingleCase getInstance(){
        if(lazySafeSingleCase == null){
            lazySafeSingleCase = new LazySafeSingleCase();
        }
        return lazySafeSingleCase ;
    }
}
