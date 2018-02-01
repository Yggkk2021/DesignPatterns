package com.command.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 12:52
 */
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.tackOrder(buyStock);
        broker.tackOrder(sellStock);

        broker.placeOrders();
    }
}
