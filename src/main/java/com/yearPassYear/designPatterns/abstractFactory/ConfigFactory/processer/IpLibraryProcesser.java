package com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.processer;

import com.yearPassYear.designPatterns.abstractFactory.ConfigFactory.ConfigProcesser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 11:05
 * @desc  配置数据-ip库数据查询
 */
public class IpLibraryProcesser implements ConfigProcesser {

    public List excuteConfigData() {
        return new ArrayList();
    }
}
