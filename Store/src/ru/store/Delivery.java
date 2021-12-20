package ru.store;

public class Delivery {

    public String typeDelivery;
    public  String timeDelivery;
    public String distance;
    public  String adress;
    public  String trackingNumber;

    public  void productLoaded(){
        System.out.println("Загрузка товара");
    }
    public  void goodsOfTranzit(){
        System.out.println("Транспортировка товара");
    }

    public  void orderDelivered(){
    System.out.println("Передача заказа");
    }

}
