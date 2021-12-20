package ru.store;

public class ShopAssistant {
    public String name;
    public String position;
    public  String expirience;

    public  void sayHello(){
        System.out.println("Приветствует покупателя");
    }

    public void advises(){
        System.out.println("Консультирует");
    }

    public void helpsWithTheChoice(){
        System.out.println("Помогает выбрать");
    }

    public void sayGoodbye(){
        System.out.println("Прощается с покупателями");
    }
}
