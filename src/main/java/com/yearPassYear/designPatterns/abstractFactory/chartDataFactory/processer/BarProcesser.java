package com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer;

import com.yearPassYear.designPatterns.factory.ChartProcesser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:05
 * @desc  柱图数据处理
 */
public class BarProcesser implements ChartProcesser {

    public List excuteChartData() {
        return new ArrayList();
    }
}
