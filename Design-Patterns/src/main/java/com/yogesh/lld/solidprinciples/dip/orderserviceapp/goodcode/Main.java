package com.yogesh.lld.solidprinciples.dip.orderserviceapp.goodcode;


public class Main {

    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        OrderService orderService = new OrderService(db);
        orderService.placeOrder(db.getClass().getName());

    }
}
