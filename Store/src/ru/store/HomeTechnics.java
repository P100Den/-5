package ru.store;

public class HomeTechnics {
    public String name;
    public  int prise;
    public  String item;
    public  String color;
    public  String guaranteePeriod;
    public  String manufacturer;

    public void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
    }
    public void takeFromTheShelf(){
        System.out.println("Продукт был взят с полки");
    }

    public void visualInspectoin(){
        System.out.println("Продукт был осмотрен");
    }

    public void putOnBasket(){
        System.out.println("Продукт был положен в корзину");
    }
    public  void buy(){
        System.out.println("Продукт куплен");
    }
}
