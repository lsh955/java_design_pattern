package com.company.design.aop;

import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class AopMain {

    public static void main(String[] args) {

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser iBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        iBrowser.show();
        System.out.println("loading time : " + end.get() + "ms");

        iBrowser.show();
        System.out.println("loading time : " + end.get() + "ms");

    }

}
