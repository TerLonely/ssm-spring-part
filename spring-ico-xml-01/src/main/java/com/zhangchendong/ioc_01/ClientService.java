package com.zhangchendong;

import java.sql.ClientInfoStatus;

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
