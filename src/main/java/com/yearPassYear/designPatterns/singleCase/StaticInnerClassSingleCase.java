package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:41
 * @desc ��̬�ڲ���ʵ�ֵ���,��Ч���̰߳�ȫ
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
