package com.company.design.singleton;

/**
 * @author 이승환
 * @since 2021-05-05
 */
public class AClass {

    public SocketClient socketClient;

    public AClass() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
