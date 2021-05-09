package com.company.design.proxy;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class ProxyMain {

    public static void main(String[] args) {

//        Browser browser = new Browser("www.naver.com");
//        browser.show();

        IBrowser iBrowser = new BrowserProxy("www.naver.com");
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();

    }

}
