package ua.hellil.hudz.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

//        Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//        Перший масив - це числа, які загадані фірмою-організатором лотереї.
//        Другий масив - це числа, які вгадав гравець.
//        Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//        У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//        first[3] повинен дорівнювати second[3], як показано нижче.
//        Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//        [0, 1, 4, 5, 5, 8, 9]
//        [1, 1, 2, 3, 5, 6, 9]
//        Кількість збігів: 3

        Scanner scanner = new Scanner(System.in);

        int lenghtmas = 7;
        int[] numLoto = new int[lenghtmas];
        int[] numPlayer = new int[lenghtmas];


        // заповнюємо рандомно два масива масиви
        for (int i = 0; i < lenghtmas; i++) {
            numLoto[i] = (int) Math.round(Math.random() * 9);
            numPlayer[i] = (int) Math.round(Math.random() * 9); // Рандомні значення чисел, які вгадав гравець.
        }

////        Ручний ввід чисел, які вгадав гравець.
//
//        for (int i = 0; i < numPlayer.length; i++) {
//            System.out.print("Введи число від 0 до " + 9 + " --> ");
//
//            if (scanner.hasNextInt() ){
//                int temp = scanner.nextInt();
//                if (temp > -1 && temp <= 9 ) {
//                    numPlayer[i] = temp;
//                    scanner.nextLine();
//                } else {
//                    System.out.println("Число не відповідає заданому діапазону!!!");
//                    i--;
//                }
//            } else {
//                System.out.println("Ви вводите не число!!!!!");
//                scanner.nextLine();
//                i--;
//            }
//        }

        System.out.println(Arrays.toString(numLoto));
        System.out.println(Arrays.toString(numPlayer));



        // Сортуємо два масива

        for (int i = 0; i < lenghtmas - 1; i++) {
            for (int j = 0; j < lenghtmas - 1 - i; j++) {

                // sort numLot

                if (numLoto[j] > numLoto[j + 1]){
                    int temp = numLoto[j];
                    numLoto[j] = numLoto[j + 1];
                    numLoto[j + 1] = temp;
                }

              //  sort numPlayer

                if (numPlayer[j] > numPlayer[j + 1]){
                    int temp = numPlayer[j];
                    numPlayer[j] = numPlayer[j + 1];
                    numPlayer[j + 1] = temp;
                }
            }
        }

        System.out.println("Сортовані масиви");
        System.out.println(Arrays.toString(numLoto));
        System.out.println(Arrays.toString(numPlayer));

        // рахуємо кількість збігів

        int[] indexCoincident = new int[lenghtmas];
        int countCoincident = 0;
//        int countCoincidentTest = 0;
        for (int i = 0; i < lenghtmas; i++) {
            if (numLoto[i] == numPlayer[i]){
                countCoincident++;
                indexCoincident[i] = 1;
            }
        }

        System.out.println("Кількість збігів " + countCoincident);

//              виводимо які елементи співпали

        if (countCoincident > 0) {
            int cout = 0;
            System.out.print("Збігся: ");
            for (int i = 0; i < indexCoincident.length; i++) {

                if (indexCoincident[i] == 1){
                    if (cout == countCoincident - 1 && cout != 0) {
                        System.out.print("та ");
                    }
                    System.out.print(i + 1 + "й ");

                    cout++;

                    if (cout == countCoincident){
                        break;
                    }
                }
            }

            if (cout > 1) {
                System.out.println(" елементи!");
            } else {
                System.out.println(" елемент!");}

        } else {
            System.out.println("Збігів не має!!!");
        }
    }
}
