package com.company.design.decorator;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class A4 extends AudiDecorator {
    public A4(ICar audi, String modelName) {
        super(audi, modelName, 2000);
    }
}
