package Sport;

public class Ball extends SportGoods{
    public String type; // football
    public String size; // 20
    public String matter; // leather
    public String weight;
    public  String brand;// adidas
    public  String color; // black
    public int price; //1000
    public  String guaranteePeriod; // 1
    public  String item;
    public  String shape;

   public void checkBrand(){
       System.out.println("ru.store.Adidas");
   }

   public void byuBall(){
       System.out.println("Черный мяч");
   }
    public void putOnTheShelf(){
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
    public void checkName(){
    System.out.println(super.name);
}
}
