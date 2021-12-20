package ru.store;

import Sport.Ball1;
import Sport.SportGoods;

public class Store<prise> {
    public static void main(String[] args) {
        Adidas p = new Adidas();
        p.checkBrand();

        SportGoods a1 = new SportGoods();
        a1.name();

        Ball1 D1 = new Ball1();
        System.out.println(D1.prise);

        SportGoods a3 = new  SportGoods();
        a3.takeFromTheShelf();

        SportGoods a4 = new SportGoods();
        a4. putOnBasket();

        SportGoods a5 = new SportGoods();
        a5.testGood();

        SportGoods a6 = new SportGoods();
        a6. buy();

        int ball = 1000;
        int discount = 200;

        ball = ball - discount;

        System.out.println(ball);


        Product f1 = new Product();
        f1.takeTheGoods();
         int product = 1580;
         int discount1 = 2;
         product = product / discount1;

        System.out.println(product);

    }



}