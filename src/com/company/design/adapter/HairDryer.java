package com.company.design.adapter;

/**
 * @author 이승환
 * @since 2021-05-19
 */
public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
        System.out.println("헤어드라이기 110v On");
    }

}
