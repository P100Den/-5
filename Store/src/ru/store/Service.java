package ru.store;

public class Service {
    public String name;
    public int price;
    public String time;
    public  String quality;

    public void servicePerformed(){
        System.out.println("Выполнена услуга");
    }

    public void feedbackSrvice(){
        System.out.println("Выполнена обратная связь");
    }
}
