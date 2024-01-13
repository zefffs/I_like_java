package ua.hellil.hudz.lessons.lesson10;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {


//        Зробити клас Person та в ньому метод personInfo()
//        На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//        Всередині методу формувати рядок у форматі: Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО
//        можна за номером + ТЕЛЕФОН
//        Метод має повертати String
//        У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//        Повинен вийти висновок такого типу:
//        Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//
//        Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//
//        Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.


        System.out.println(personInfo());
        System.out.println(personInfo());
        System.out.println(personInfo());

    }

    static String personInfo() {

        Scanner scaner = new Scanner(System.in);


        System.out.print("Введи імя: ");
        String name = scaner.nextLine();

        System.out.print("Введи прізвище: ");
        String surName = scaner.nextLine();

        System.out.print("Введи місто: ");
        String city = scaner.nextLine();

        System.out.print("Введи номер телефона: ");
        String phoneNumber = scaner.nextLine();

        return "Зателефонувати громодянину " + name + " " + surName + " із міста "
                + city + " можна за номером телефона " + phoneNumber + ".";
    }





}






