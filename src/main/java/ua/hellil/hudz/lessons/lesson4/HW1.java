package ua.hellil.hudz.lessons.lesson4;

public class HW1 {
    public static void main(String[] args) {

//        Паралелепіпед:
//
//        Створити у новому класі main-метод;
//
//        Створити три змінні для зберігання сторін паралелепіпеда;
//
//        Порахувати обсяг у змінній volume;
//
//        Вивести на екран змінну volume у вигляді:
//
//        System.out.println("Об'єм паралелепіпеда = " + volume);
//
//        Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
//
//        Прикріпити до LMS файл .java з вашою роботою;
//
//        Файл .java лежить за таким шляхом:
//
//        папка проекту -> src -> your_package_name -> MyApp.java
//
//        де MyApp - назва вашого класу/файлу


        int volume;
        int length;
        int a = 12;
        int b = 10;
        int c = 8;

        volume = a * b * c;
        length = (a + b + c) * 4;

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина всіх сторін = " + length);


    }
}
