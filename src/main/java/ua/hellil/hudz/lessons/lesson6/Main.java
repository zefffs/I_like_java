package ua.hellil.hudz.lessons.lesson6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //        FOR


        /*

        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
              )
              {
                  код
              }
         */

//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ




       for (int i = 0; i < 5; i++){
           System.out.println("Hello!");
           i++;
           System.out.println(i);
       }

//        int i = 0;
//        for ( ; ; ) {
//            System.out.println("Hello");
//            i++;
//            if (i == 10) {
//                break;
//            }
//        }
//
//        System.out.println(i);


//        for (int i = 0; ; i++) {
//            if (i == 2 || i == 4) {
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }


//        for (int i = 0; i <= 20; i += 5) {
//            System.out.println(i);
//        }


//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }

//        int counter = 0;
//        for (int i = 0; i < 15; i++) {
////            System.out.println("i = " + i);
//            for (int j = 0; j < 22; j++) {
////                System.out.println("j = " + j);
//
//                for (int k = 0; k < 17; k++) {
//                    counter++;
//                }
//            }
////            System.out.println();
//        }
//        System.out.println("counter = " + counter);


//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

        //version 1
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }



//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }
       Scanner scanner = new Scanner(System.in);
       
       while (true) {
           System.out.println("Введи чесло");
           if (scanner.hasNextInt()){

               int nuber = scanner.nextInt();
               System.out.println(nuber);
               break;
           } else {
               System.out.println("введи число а не символ");
               scanner.nextLine();
           }
       }


        // WHILE

//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello");
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter integer from 10 to 20");
//            if (scanner.hasNextInt()) {
//                int userValue = scanner.nextInt();
//                if (userValue >= 10 & userValue <= 20) {
//                    System.out.println("user value = " + userValue);
//                    break;
//                } else {
//                    System.out.println("FROM 10 TO 20!!!");
////                    scanner.nextLine();
//                }
//
//            } else {
//                System.out.println("Wrong data! Try again");
////                scanner.nextLine();
//            }
//            scanner.nextLine();
//        }

//        int i = 0;
//        while (i < 100) {
//            i++;
//
//            if (i == 5 || i == 7) {
//                continue;
//            }
//
//            System.out.println(i);
//
//
//            if (i == 8) {
//                break;
//            }
//        }



//        int i = 0;
//
//        do {
//            System.out.println("Hello");
//            i++;
//        } while (i < 2);


//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int counter = 10;
//        while (counter >= 0) {
//
//            int randomNumber = (int) (Math.random() * 101);
//
//            if (randomNumber >= 85 && randomNumber <= 100) {
//                System.out.println("WIN!!!");
//                break;
//            }
//
//            System.out.println(counter);
//
//            if (counter == 0) {
//                System.out.println("BOOOOM!!!");
//            }
//            counter--;
//        }


//        ДЗ
//
//        У Японії числа 4 та 9 вважаються нещасливими.
//        Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.
//
//        int counter = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
//                continue;
//            }
//            counter++;
//            System.out.println(i);
//        }
//        System.out.println("counter = " + counter);
//



    }
}
