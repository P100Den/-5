package ru.store;

public class Merchandiser {
    public String name;
    public String position;
    public  int price; // 50

     public void layoutGood(){
        System.out.println("Планирование");
    }

    public int CheckThePrice(){
        System.out.println("Цена:"+ price);
        return price;
    }
   public void printPriceTag(){
        System.out.println("Печатать ценник");
    }
   public void replaceOfPriceTag(){
        System.out.println("Замена ценников");
    }
}
