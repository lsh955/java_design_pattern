package com.company.design.adapter;

/**
 * @author 이승환
 * @since 2021-05-19
 */
public class SocketAdapter implements Electronic110V {

    public Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }

}
