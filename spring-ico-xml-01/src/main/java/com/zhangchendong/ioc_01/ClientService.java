package com.zhangchendong.ioc_01;

/**
 * @author zhangchendong
 * @data 2024/1/24 16:18
 */
public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService(){}

    public static ClientService createClient(){
        return clientService;
    }
}
