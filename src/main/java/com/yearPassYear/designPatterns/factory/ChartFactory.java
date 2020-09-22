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
 * @desc  �򵥹���ģʽ
 * ������⣺�������ӿ�ѡ������
 * ���ʹ�ã����ݲ�ͬ����������ͬ����ʵ��
 * ʵ�ַ���������ʵ�ֹ����ӿ�,���س����Ʒ
 *  ���ó�����������Ӷ��󴴽����������Ͳ�ͬ����ͬ������ǰdemo�����ݲ�ͬͼ������chartType��ʵ������ͬ����������ò�ͬ������ò�ͬͼ������
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
