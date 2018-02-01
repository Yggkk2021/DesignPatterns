package com.mediator.pattern;

import com.builder.pattern.model.ChickenBurger;

/**
 * Create by yangshunfan
 * 2018/2/1 14:16
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }
}
