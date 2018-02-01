package com.command.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 12:46
 */
public class BuyStock implements Order {

    private Stock buyStock;

    public BuyStock(Stock buyStock) {
        this.buyStock = buyStock;
    }

    @Override
    public void execute() {
        buyStock.buy();
    }
}
