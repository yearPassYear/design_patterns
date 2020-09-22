package com.yearPassYear.designPatterns.factory.processer;

import com.yearPassYear.designPatterns.factory.ChartProcesser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:06
 * @desc  雷达图数据处理
 */
public class RaderProcesser implements ChartProcesser {
    public List excuteChartData() {
        return new ArrayList();
    }
}
