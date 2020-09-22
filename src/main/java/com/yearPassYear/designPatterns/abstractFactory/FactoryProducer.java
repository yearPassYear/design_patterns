package com.yearPassYear.designPatterns.abstractFactory;

import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.ConfigFactory;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.ChartFactory;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 13:48
 * @desc
 */
public class FactoryProducer {

    List getFactory(String type,String biz){
        List res = null ;
        if(StringUtils.isEmpty(type)) {
            res =  null ;
        }else if(type.equals("chart")){
            res = new ChartFactory().excuteChartData(biz);
        }else if(type.equals("config")){
            res = new ConfigFactory().excuteConfigData(biz);
        }
        return res ;
    }

}
