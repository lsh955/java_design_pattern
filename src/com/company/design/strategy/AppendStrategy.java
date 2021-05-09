package com.company.design.strategy;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class AppendStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }

}
