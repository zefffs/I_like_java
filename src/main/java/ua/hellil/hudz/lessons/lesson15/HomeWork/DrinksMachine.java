package ua.hellil.hudz.lessons.lesson15.HomeWork;

public enum DrinksMachine {
    TEA(15.50),
    COFFEE(25.50),
    COLA(18.60),
    LEMONADE(14.40),
    MOJITO(12.35),
    MINERAL(9.75);

    private final double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
