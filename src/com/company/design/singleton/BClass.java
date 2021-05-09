package com.company.design.singleton;

/**
 * @author 이승환
 * @since 2021-05-05
 */
public class BClass {

    public SocketClient socketClient;

    public BClass() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
