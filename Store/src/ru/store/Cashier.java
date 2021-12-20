package ru.store;

public class Cashier {
    public String name;
    public String position;
    public String expirience;

    public  void sayHello(){
        System.out.println("Приветствует покупателя");
    }
    public  void scanGood(){
        System.out.println("Проведено сканирование товара");
    }

    public  void sayTheAmount(){
        System.out.println("Назвать сумму");
    }
    public void priceCheck(){
        System.out.println("Проверка цены");
    }
    public void packGood(){
    System.out.println("Упаковка");
    }
    public  void sayGoodbye(){
        System.out.println("Прощается с покупателями");
    }

}
