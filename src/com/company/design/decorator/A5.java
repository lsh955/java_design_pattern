package com.company.design.decorator;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class A5 extends AudiDecorator {
    public A5(ICar audi, String modelName) {
        super(audi, modelName, 3000);
    }
}
