package com.company.design.strategy;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Encoder {

    private EncodingStrategy encodingStrategy;

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

}
