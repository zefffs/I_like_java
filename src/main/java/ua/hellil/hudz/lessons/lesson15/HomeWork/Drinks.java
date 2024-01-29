package ua.hellil.hudz.lessons.lesson15.HomeWork;

public class Drinks {

    DrinksMachine nameDrink;
    private static double sumPrice = 0.0;
    private static int countDrink = 0;

    public Drinks(DrinksMachine nameDrink, double price) {
        this.nameDrink = nameDrink;
        sumPrice += price;
        countDrink ++;
    }

    static void prepareDrink(DrinksMachine userChoseDrink) {
        System.out.println(userChoseDrink + " - готується!");
    }

    public DrinksMachine getNameDrink() {
        return nameDrink;
    }

    public static double getPrice() {
        return sumPrice;
    }

    public  static int getCountDrink() {
        return countDrink;
    }
}
