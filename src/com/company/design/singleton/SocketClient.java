package com.company.design.singleton;

/**
 * @author 이승환
 * @since 2021-05-05
 */
public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient() {}

    public static SocketClient getInstance() {
        if (socketClient == null)
            socketClient = new SocketClient();

        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }

}
