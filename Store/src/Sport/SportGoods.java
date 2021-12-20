package Sport;

public class SportGoods {
    private String Sportmaster;
    public String name = Sportmaster;
    public int prise = 1000;
    public String item;
    public String color; // black
    public String guaranteePeriod;


    public void checkTheOutputOnTheShelf() {
        System.out.println("Продукт был положен на полку");
    }

    public void takeFromTheShelf() {
        System.out.println("Продукт был взят с полки");
    }

    public void putOnBasket() {
        System.out.println("Продукт был положен в корзину");
    }

    public void testGood() {
        System.out.println("Проведение теста");
    }

    public void buy() {
        System.out.println("Продукт куплен");
    }

    public int CheckThePrice(int i) {
        int price = 1000;
        System.out.println("Цена:" + price);
        return price;
    }

    public void name() {
        System.out.println("Спортмастер");
    }


}