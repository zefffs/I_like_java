package ua.hellil.hudz.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String otherMeat;
    String cheese;
    String greenery;
    String mayonnaise;




    Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;

        System.out.println("До складу звичайного бургеру входить:");
        System.out.println(this.bun);
        System.out.println(this.meat);
        System.out.println(this.cheese);
        System.out.println(this.greenery);
        System.out.println(this.mayonnaise);
        System.out.println();




    }

    Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;

        System.out.println("До складу дієтичного бургеру входить:");
        System.out.println(this.bun);
        System.out.println(this.meat);
        System.out.println(this.cheese);
        System.out.println(this.greenery);
        System.out.println();

    }


//    String bun, String meat, String otherMeat, String cheese, String greenery, String
    Burger(String bun, String meat, String otherMeat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.otherMeat = otherMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;



        System.out.println("До складу бургеру з пдвійним м'ясом входить:");
        System.out.println(this.bun);
        System.out.println(this.meat);
        System.out.println(this.otherMeat);
        System.out.println(this.cheese);
        System.out.println(this.greenery);
        System.out.println(this.mayonnaise);
        System.out.println();



    }

}
