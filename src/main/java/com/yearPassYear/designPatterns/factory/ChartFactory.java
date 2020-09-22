package com.yearPassYear.designPatterns.factory;


import com.yearPassYear.designPatterns.factory.processer.BarProcesser;
import com.yearPassYear.designPatterns.factory.processer.LineProcesser;
import com.yearPassYear.designPatterns.factory.processer.PieProcesser;
import com.yearPassYear.designPatterns.factory.processer.RaderProcesser;
import org.apache.commons.lang.StringUtils;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:11
 * @desc  简单工厂模式   适用场景：多个复杂对象创建
 */
public class ChartFactory {

     ChartProcesser instanceProcesser(String chartType){
        ChartProcesser chartProcesser = null ;
        if(StringUtils.isEmpty(chartType)){
            chartProcesser = null ;
        }else if(chartType.equals("bar")){
            chartProcesser = new BarProcesser() ;
        }else if(chartType.equals("line")){
            chartProcesser = new LineProcesser() ;
        }else if(chartType.equals("pie")){
            chartProcesser = new PieProcesser() ;
        }else if(chartType.equals("rader")){
            chartProcesser = new RaderProcesser() ;
        }
        return chartProcesser ;
    }


    public static void main(String[] args) {
        System.out.println(new ChartFactory().instanceProcesser("bar").excuteChartData());
        System.out.println( new ChartFactory().instanceProcesser("line").excuteChartData());
        System.out.println(new ChartFactory().instanceProcesser("pie").excuteChartData());
        System.out.println(new ChartFactory().instanceProcesser("rader").excuteChartData());
    }
}
