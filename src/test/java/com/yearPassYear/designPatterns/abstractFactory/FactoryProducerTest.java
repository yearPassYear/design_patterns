package com.yearPassYear.designPatterns.abstractFactory;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author tanql
 * @version 1.5.0
 * @date 2020/9/22 14:11
 * @desc
 */
public class FactoryProducerTest {

    @Test
    public void getFactory() {
        assertEquals(new ArrayList(),new FactoryProducer().getFactory("chart", "bar"));
    }
}