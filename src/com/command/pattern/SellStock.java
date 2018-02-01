package com.command.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 12:48
 */
public class SellStock implements Order {

    private Stock sellStock;

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
