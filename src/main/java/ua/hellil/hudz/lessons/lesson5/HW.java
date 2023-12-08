package ua.hellil.hudz.lessons.lesson5;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
//        ввести ім'я першої команди
//        ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
//        ввести ім'я другої команди
//        ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
//        підрахувати середнє арифметичне балів кожної команди
//        порівняти результати команд та визначити переможця
//        вивести у консоль:
//        "Перемогла команда" + teamName + "набрала" + result + "очків"

        Scanner scanner = new Scanner(System.in);

//       фргі гравців першої команди
        int frag_1_playerFirstTeam = 0;
        int frag_2_playerFirstTeam = 0;
        int frag_3_playerFirstTeam = 0;
        int frag_4_playerFirstTeam = 0;
        int frag_5_playerFirstTeam = 0;

        System.out.println("Bвести ім'я першої команди");
        String nameFirstTeam = scanner.nextLine();


        System.out.print("Ввести кількість фрагів 1 го гравця команди " + nameFirstTeam + ": ");
        if (scanner.hasNextInt()){
            frag_1_playerFirstTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 2 го гравця команди " + nameFirstTeam + ": ");

        if (scanner.hasNextInt()){
            frag_2_playerFirstTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 3 го гравця команди " + nameFirstTeam + ": ");

        if (scanner.hasNextInt()){
            frag_3_playerFirstTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 4 го гравця команди " + nameFirstTeam + ": ");

        if (scanner.hasNextInt()){
            frag_4_playerFirstTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 5 го гравця команди " + nameFirstTeam + ": ");

        if (scanner.hasNextInt()){
            frag_5_playerFirstTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }



        int frag_1_playerSecondTeam = 0;
        int frag_2_playerSecondTeam = 0;
        int frag_3_playerSecondTeam = 0;
        int frag_4_playerSecondTeam = 0;
        int frag_5_playerSecondTeam = 0;

        scanner.nextLine(); // очищуємо буфер від зайвих данних

        System.out.println("Bвести ім'я другої команди");
        String nameSecondTeam = scanner.nextLine();

        System.out.print("Ввести кількість фрагів 1 го гравця команди " + nameSecondTeam + ": ");

        if (scanner.hasNextInt()){
            frag_1_playerSecondTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 2 го гравця команди " + nameSecondTeam + ": ");

        if (scanner.hasNextInt()){
            frag_2_playerSecondTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 3 го гравця команди " + nameSecondTeam + ": ");

        if (scanner.hasNextInt()){
            frag_3_playerSecondTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 4 го гравця команди " + nameSecondTeam + ": ");

        if (scanner.hasNextInt()){
            frag_4_playerSecondTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        System.out.print("Ввести кількість фрагів 5 го гравця команди " + nameSecondTeam + ": ");

        if (scanner.hasNextInt()){
            frag_5_playerSecondTeam = scanner.nextInt();
        } else {
            System.out.println("Помилка ввода, данні не відповідають типу int, перезапусти программу!");
            System.exit(0);
        }

        double sum_nameFirstTeam = (frag_1_playerFirstTeam + frag_2_playerFirstTeam + frag_3_playerFirstTeam + frag_4_playerFirstTeam + frag_5_playerFirstTeam) / 5;
        double sum_nameSecondTeam = (frag_1_playerSecondTeam + frag_2_playerSecondTeam + frag_3_playerSecondTeam + frag_4_playerSecondTeam + frag_5_playerSecondTeam) / 5;

        if (sum_nameSecondTeam > sum_nameFirstTeam){
            System.out.println("Перемогла команда " + nameSecondTeam + ", набрала " + sum_nameSecondTeam + " очків");
        } else if (sum_nameSecondTeam < sum_nameFirstTeam) {
            System.out.println("Перемогла команда " + nameFirstTeam + ", набрала " + sum_nameFirstTeam + " очків");
        } else {
            System.out.println("Нічия, команди набрали однакову кількість очків");
        }


//        System.out.println(sum_nameFirstTeam + "   " + sum_nameSecondTeam);

    }
}
