package ua.hellil.hudz.lessons.lesson7;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.



        int playersInTeam = 25;

        int[] oneTeam = new int[playersInTeam];
        int[] twoTeam = new int[playersInTeam];

        int sumYearOneTeam = 0;
        int sumYearTwoTeam = 0;

        for (int i = 0; i < playersInTeam; i++) {
            oneTeam[i] = (int) Math.round(Math.random() * 22) + 18;
            sumYearOneTeam += oneTeam[i];
            twoTeam[i] = (int) Math.round(Math.random() * 22) + 18;
            sumYearTwoTeam += twoTeam[i];

        }


        for (int i = 0; i < playersInTeam; i++) {

            if (i == playersInTeam - 1){
            System.out.print(oneTeam[i]);
                System.out.println();


            } else {
                System.out.print(oneTeam[i] + ", ");
            }

        }
        for (int i = 0; i < playersInTeam; i++) {

            if (i == playersInTeam - 1){
                System.out.print(twoTeam[i]);
                System.out.println();
            } else {
                System.out.print(twoTeam[i] + ", ");
            }

        }

//        System.out.println(Arrays.toString(oneTeam)); так швидше можна вивести список команд.
//        System.out.println(Arrays.toString(twoTeam));
        System.out.println("Average age of the first team - " + sumYearOneTeam / playersInTeam);
        System.out.println("Average age of the second team - " + sumYearTwoTeam / playersInTeam);

    }
}
