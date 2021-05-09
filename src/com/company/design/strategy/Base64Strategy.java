package com.company.design.strategy;

import java.util.Base64;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Base64Strategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
