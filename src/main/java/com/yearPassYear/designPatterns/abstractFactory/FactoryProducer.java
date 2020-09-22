package com.yearPassYear.designPatterns.abstractFactory;

import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.ConfigFactory;
import com.yearPassYear.designPatterns.abstractFactory.chartDataFactory.ChartFactory;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 13:48
 * @desc 抽象工厂模式 包含：抽象工厂，具体工厂，抽象产品，具体产品
 * 解决：复杂接口调用，例如数据接口分为图形接口/配置接口，配置接口又分为ip库等配置，图形接口分为折线图等接口
 * 注意：一般不建议使用，会使设计变得复杂
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
