package com.company.design.observer;

/**
 * @author 이승환
 * @since 2021-05-09
 */
public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }

}
