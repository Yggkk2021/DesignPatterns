package com.mediator.pattern;

import java.util.Date;

/**
 * Create by yangshunfan
 * 2018/2/1 14:15
 */
public class ChatRoom {
    public static void showMessage(User user,String message) {
        System.out.println(new Date().toString() + "\nUser:" + user.getName() + "\n" + "Message:" + message);
    }
}
