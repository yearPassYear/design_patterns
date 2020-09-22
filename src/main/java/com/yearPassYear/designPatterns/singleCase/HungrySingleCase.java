package com.yearPassYear.designPatterns.singleCase;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:36
 * @desc ����ʽ����  �������ʱ��ʼ��  ���̰߳�ȫ�����˷���Դ
 */
public class HungrySingleCase {
    private HungrySingleCase(){
    }

    private static HungrySingleCase hungrySingleCase = new HungrySingleCase();

    public HungrySingleCase getInstance(){
        return hungrySingleCase ;
    }


}
