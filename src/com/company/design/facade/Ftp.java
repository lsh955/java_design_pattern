package com.company.design.facade;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.println("FTP HOST : " + host + " PORT : " + port + "로 연결합니다.");
    }

    public void moveDirectory() {
        System.out.println("FTP PATH : " + path + "로 이동 합니다.");
    }

    public void disConnect() {
        System.out.println("FTP 연결을 종료 합니다.");
    }
}
