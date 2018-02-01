package com.command.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/2/1 12:50
 * 代理类
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void tackOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        //这里clear，将链表清空
        orderList.clear();
    }

}
