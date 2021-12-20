package ru.store;

public class Sale {
    public String puymentType;
    public  String serviceTime;

    public  void consultation(){
        System.out.println("Проведена консультация");
    }

    public void priceCheck(){
        System.out.println("Проверка цены");
    }
    public void scanGood(){
        System.out.println("Проведено сканирование товара");
    }
    public void getACheck(){
        System.out.println("Получин чек");
    }
}
