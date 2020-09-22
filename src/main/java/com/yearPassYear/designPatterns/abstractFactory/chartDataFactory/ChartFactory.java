package com.yearPassYear.designPatterns.abstractFactory.chartDataFactory;

import com.yearPassYear.designPatterns.abstractFactory.AbstractFactory;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer.BarProcesser;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer.LineProcesser;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer.PieProcesser;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.processer.RaderProcesser;
import com.yearPassYear.designPatterns.factory.ChartProcesser;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 12:25
 * @desc
 */
public class ChartFactory extends AbstractFactory {

    @Override
    public List excuteChartData(String chartType) {
        ChartProcesser chartProcesser = null ;
        if(StringUtils.isEmpty(chartType)){
            chartProcesser =  null ;
        }else if(chartType.equals("bar")){
            chartProcesser =  new BarProcesser();
        }else if(chartType.equals("pie")){
            chartProcesser = new PieProcesser();
        }else if(chartType.equals("line")){
            chartProcesser = new LineProcesser();
        }else if(chartType.equals("rader")){
            chartProcesser = new RaderProcesser();
        }
        return chartProcesser == null ? null : chartProcesser.excuteChartData();
    }

    @Override
    public List excuteConfigData(String configType) {
        return null;
    }
}
