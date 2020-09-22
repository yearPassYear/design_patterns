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
 * @desc  简单工厂模式
 * 解决问题：解决多个接口选择问题
 * 如何使用：根据不同条件创建不同子类实例
 * 实现方法：子类实现工厂接口,返回抽象产品
 *  适用场景：多个复杂对象创建，根据类型不同作不同处理，当前demo：根据不同图形类型chartType，实例化不同工厂子类调用不同方法获得不同图形数据
 *
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
        ChartProcesser barProcesser = new ChartFactory().instanceProcesser("bar");
        ChartProcesser lineProcesser = new ChartFactory().instanceProcesser("line");
        ChartProcesser pieProcesser = new ChartFactory().instanceProcesser("pie");
        ChartProcesser raderProcesser = new ChartFactory().instanceProcesser("rader");
        System.out.println(barProcesser.excuteChartData());
        System.out.println( lineProcesser.excuteChartData());
        System.out.println(pieProcesser.excuteChartData());
        System.out.println(raderProcesser.excuteChartData());
    }
}
