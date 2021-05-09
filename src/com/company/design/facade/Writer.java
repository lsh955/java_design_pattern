package com.company.design.facade;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s 로 연결 합니다.", fileName);
        System.out.println(msg);
    }

    public void writer() {
        String msg = String.format("Writer %s 로 연결 종료 합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect() {
        String msg = String.format("Writer %s 로 연결 종료 합니다.", fileName);
        System.out.println(msg);
    }

}
