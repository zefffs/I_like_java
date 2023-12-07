package ua.hellil.hudz.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);

//        System.out.println(!true);
//        System.out.println(!false);

//        boolean result = a > b;
//        System.out.println("result = " + result);

//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//        String str4 = new String("Helllo");
//
//
//        System.out.println(str1 == str2);
//        System.out.println(str4 == str3);
////
//        System.out.println(str1.equals(str2));
//        System.out.println(str4.equals(str1));


//        int a = 5;
//        int b = 10;
//        int c = 15;
//        int d = 17;
////
//        boolean result = a > b || c < b;
//        System.out.println(result);
//
//
//        boolean result2 = a > b && c > b;
//        System.out.println("result2 = " + result2);
//
//
//
//        boolean result3 = a > b || b < c && a > b || b < c;
//        System.out.println("result3 = " + result3);


//        System.out.println(false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || true);


//        int x = 5;
//
//        System.out.println(x > 6 && ++x < 1);
//
//        System.out.println("x = " + x);



//        int x = 5;
//        System.out.println(++x > 5 && ++x >= 6 && ++x >= 6 && ++x >= 6 && ++x >= 6);  // true
//        System.out.println("x = " + x);                         // 7


//        System.out.println(++x > 5);
//        System.out.println("x = " + x);
//        System.out.println(x++ == 6);
//        System.out.println("x = " + x);
//        System.out.println(x++ != 6);
//        System.out.println("x = " + x);

//        int a = 5;
//        System.out.println(a++ > 11 || ++a == 6 && ++a == 7);
//        System.out.println(a);


//        int a = 1;
//        int b = 10;
//
////        if (a < b) {
////            System.out.println("a < b");
////        }
//

//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a = b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else if (a < b) {
//            System.out.println("a < b");
//        }else {
//            System.out.println("a = b");
//        }

//        if (a >= b) {
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a = b");
//            }
//
//        } else {
//            System.out.println("a < b");
//        }


        // BAD VERSION
//        if (a == b)
//            System.out.println("a = b");
//            System.out.println("a = b");
////            System.out.println("a = b");
//
//
//        switch (str4) {
//            case "hello": {
//                System.out.println("hello");
//                break;
//            }
//            case "Hello": {
//                System.out.println("Hello");
//                break;
//            }
//            case "Helllo":{
//                System.out.println("Helllo");
//                break;
//            }
//
//            default: {
//                System.out.println("default");
//            }
//        }


//        String str = "QWE";
//
//        switch (str) {
//            case "QWe": {
//                System.out.println(1);
//                break;
//            }
//            case "QwE": {
//                System.out.println(2);
//                break;
//            }
//            case "qWE": {
//                System.out.println(3);
//                break;
//            }
//            case "QWE": {
//                System.out.println(4);
//                break;
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("vvod");
        if (scanner.hasNextInt()){
            a =  scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("wrong");
            System.exit(0);
        }
        System.out.println("vvod str");
        String str = scanner.nextLine();
        System.out.println(str);




//        System.out.println("Please enter string");
//        String userValue1 = scanner.nextLine();
//
//        System.out.println("user value1 = " + userValue1);


//        int intUserValue = 0;
//        System.out.println("Please enter integer");
//
//        if (scanner.hasNextInt()) {
//            intUserValue = scanner.nextInt();
//        } else {
//            System.out.println("Wrong data! Restart program!!!");
//            System.exit(0);
//        }
//
//        System.out.println("user value = " + intUserValue);


//        System.out.println("please enter integer");
//        int intValue = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("int value = " + intValue);
//
//        System.out.println("Please enter string");
//        String strValue = scanner.nextLine();
//        System.out.println("str value = " + strValue);

    }
}
