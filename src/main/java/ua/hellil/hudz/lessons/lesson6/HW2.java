package ua.hellil.hudz.lessons.lesson6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

//        Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у
//        діапазоні від 0 до 10
//        Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


        Scanner scanner = new Scanner(System.in);

        int numPlayer = 0;
        int pop = 3;
        int numPC = 0; //(int) Math.round(Math.random() * 10);

        System.out.println("Відгадай ціле число, яке я загадав в діапазоні від 0 до 10.");



//        System.out.println(nuberPC);

        while (true){

            if (pop == 0){
                System.out.println("Ти програв число яке я загадав  " + numPC);
                break;
            }

            System.out.println( "У тебe " + pop + " спроби!");
            if (scanner.hasNextInt()){
                 numPlayer = scanner.nextInt();
                 scanner.nextLine();


            } else {
                System.out.println("Не коректні дані!!!");
                scanner.nextLine();
                pop--;
                continue;
            }

            if (numPC == numPlayer) {
                System.out.println("Ти виграв. Молодець!!!");
                break;
            }

            pop--;

        }
    }
}
