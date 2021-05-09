package com.company.design.decorator;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class A3 extends AudiDecorator {
    public A3(ICar audi, String modelName) {
        super(audi, modelName, 1000);
    }
}
