package com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer;

import com.yearPassYear.designPatterns.factory.ChartProcesser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:04
 * @desc ��ͼ���ݴ���
 */
public class LineProcesser implements ChartProcesser {


    public List excuteChartData() {
        return new ArrayList();
    }
}
