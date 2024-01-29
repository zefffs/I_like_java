package ua.hellil.hudz.lessons.lesson15.HomeWork;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static ua.hellil.hudz.lessons.lesson15.HomeWork.Drinks.*;

public class Main {
    public static void main(String[] args) {

            runApp();
            String s = (getCountDrink() > 1 ) ? "напоїв" : "напій";
            System.out.println("Ваше замовлення в кількості " + getCountDrink() + " " +  s  +  " до сплати " + getPrice());

    }

    static void runApp() {

        Scanner scanner = new Scanner(System.in);

        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine userChoseDrink = null;
        String userChose = "YES";

        System.out.println("Що бажаєте випити?");


        while (userChose.equals("YES")) {


            while (userChoseDrink == null) {

                System.out.println("Ви можете вибрати наступні напої " + Arrays.toString(drinksMachines));
                userChose = scanner.nextLine().toUpperCase();

                for (DrinksMachine drinksMachine : drinksMachines) {
                    if (drinksMachine.toString().equals(userChose)) {
                        userChoseDrink = DrinksMachine.valueOf(userChose);
                        break;
                    }
                }
                if (userChoseDrink == null) {
                    System.out.println("Такого напою немає)!");
                }
            }

            switch (userChoseDrink) {
                case TEA: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
                case COFFEE: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
                case COLA: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
                case MOJITO: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
                case MINERAL: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
                case LEMONADE: {
                    new Drinks(userChoseDrink, userChoseDrink.getPrice());
                    prepareDrink(userChoseDrink);
                    break;
                }
            }



            System.out.println("Бажаєте ще щось випити? Введіть yes або no!");

           while (true){
               userChose = scanner.nextLine().toUpperCase();

               if (userChose.equals("YES")) {
                   userChoseDrink = null;
                   break;
               } else if (userChose.equals("NO")) {
                   break;
               } else {
                   System.out.println("Введіть yes або no!");
               }
           }
        }
    }
}