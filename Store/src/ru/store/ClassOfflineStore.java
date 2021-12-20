package ru.store;

public class ClassOfflineStore {
    public String name; // Magnit
    public  String square; // 400
    public  String workhous; // 8:00 - 22:00

    public  void openStore(){
        System.out.println("Магазин был открыт");

    }

    public void closeStore(){
        System.out.println("Магазин был закрыт");
    }

    public  void checkWorkHous(){
        System.out.println("Проверить время работы");
    }


}
