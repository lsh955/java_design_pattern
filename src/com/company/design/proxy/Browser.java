package com.company.design.proxy;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Browser implements IBrowser {

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }

}
