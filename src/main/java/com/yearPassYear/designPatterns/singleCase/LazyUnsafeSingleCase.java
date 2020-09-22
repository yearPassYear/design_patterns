package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:28
 * @desc  ����ʽ�̲߳���ȫ������Ч�ʸߵ����̲߳���ȫ
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
