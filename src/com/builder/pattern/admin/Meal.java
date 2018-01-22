package com.builder.pattern.admin;

import com.builder.pattern.service.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/1/22 13:17
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 过得话费账单
     * @return
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 获取商品信息
     */
    public void showItem() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",Packing" + item.packing().pack());
            System.out.println(",Price:" + item.price());
        }
    }
}
