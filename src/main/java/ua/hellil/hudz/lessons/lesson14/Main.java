package ua.hellil.hudz.lessons.lesson14;

public class Main {
    public static void main(String[] args) {


        String [] modelsIPhone = {"iPhone 11 Pro", "iPhone 12 Pro Max", " iPhone 13 Pro ", "iPhone 14 Pro Max"};
        String [] modelsAndroid = {"Xiaomi Mi Note", "Xiaomi 12X", "Xiaomi Mi Max 2", "Xiaomi Mi A1", "Xiaomi 11T Pro"};

        IPhones iPhone = new IPhones(modelsIPhone[(int) (Math.random() * modelsIPhone.length)]);
        Androids xiaomi = new Androids(modelsAndroid[(int) (Math.random() * modelsAndroid.length)]);

        xiaomi.call();
        xiaomi.sms();
        System.out.println(xiaomi.getModel());

        System.out.println();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        xiaomi.setVersion(iPhone.getVersion());
        xiaomi.versionAndroid();



    }
}

//Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
//Зробіть класи, які його імплементують: Androids, iPhones.
//Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
//Створіть екземпляри кожного виду у мейн-класі