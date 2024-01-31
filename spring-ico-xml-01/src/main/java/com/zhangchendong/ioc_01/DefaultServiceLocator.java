package com.zhangchendong.ioc_01;

/**
 * @author zhangchendong
 * @data 2024/1/24 18:37
 */
public class DefaultServiceLocator {

    private static FactoryService factoryService = new FactoryService();

    public FactoryService createFactory(){
        return factoryService;
    }
}
