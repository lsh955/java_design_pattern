package com.company.design.adapter;

/**
 * @author 이승환
 * @since 2021-05-19
 */
public class Cleaner implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("청소기 220v On");
    }

}
