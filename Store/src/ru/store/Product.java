package ru.store;

public class Product {
    public String name;
    public int price; // Soda = 80 Alcohol = 1500
    public  String item; // Soda.Alcohol

    public  void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
        }
    public void takeFromTheShelf(){
            System.out.println("Продукт был взят с полки");
        }

    public void choiceProduct(){
            System.out.println("Продукт был выбран");
        }

    public  void buy(){
            System.out.println("Продукт куплен");
        }
        public void takeTheGoods(){
            System.out.println("Soda + Alcohol = 50%");
        }


    }

