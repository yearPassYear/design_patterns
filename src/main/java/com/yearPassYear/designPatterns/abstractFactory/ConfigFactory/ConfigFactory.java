package com.yearPassYear.designPatterns.abstractFactory.ConfigFactory;

import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.processer.DataSourceProcesser;
import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.processer.IpLibraryProcesser;
import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.processer.OperatorProcesser;
import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.processer.TaskProcesser;
import com.yearPassYear.designPatterns.abstractFactory.AbstractFactory;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 12:29
 * @desc
 */
public class ConfigFactory extends AbstractFactory {

    @Override
    public List excuteChartData(String chartType) {
        return null;
    }

    @Override
    public List excuteConfigData(String configType) {
        ConfigProcesser configProcesser = null ;
        if(StringUtils.isEmpty(configType)){
            configProcesser =  null ;
        }else if(configType.equals("datasource")){
            configProcesser =  new DataSourceProcesser();
        }else if(configType.equals("ip")){
            configProcesser = new IpLibraryProcesser();
        }else if(configType.equals("oprator")){
            configProcesser = new OperatorProcesser();
        }else if(configType.equals("task")){
            configProcesser = new TaskProcesser();
        }
        return configProcesser == null ? null : configProcesser.excuteConfigData();
    }
}
