package com.yearPassYear.designPatterns.abstractFactory;

import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:44
 * @desc  ���󹤳�--����ͼ�����ݹ��ֺ��������ݹ���
 */
public  abstract class AbstractFactory {

    public abstract List excuteChartData(String chartType);

    public abstract List excuteConfigData(String configType);
}
