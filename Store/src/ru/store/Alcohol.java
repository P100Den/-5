package ru.store;

public class Alcohol {
   public String name;
   public int prise;
   public String item;
   public String size;
   public String volume;
   public String manufacturer;


    public  void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
    }
    public void takeFromTheShelf(){
        System.out.println("Продукт был взят с полки");
    }

    public void choiceProduct(){
        System.out.println("Выбор продукта");
    }

    public void visualInspectoin(){
        System.out.println("Продукт был осмотрен");
    }
    public void putOnBasket(){
        System.out.println("Продукт был положен в корзину");
    }

    public void buy(){
        System.out.println("Продукт куплен");
    }
}
