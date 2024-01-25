package ua.hellil.hudz.lessons.lesson14;

public class Androids implements Smartphones, LinuxOS{

    private String version;

    private String model;


    public Androids(String model) {
        this.version = "Android 8.0 / 8.1 Oreo";
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("Дзвонить " + model);

    }

    @Override
    public void sms() {
        System.out.println("Прийшло повідомлення на " + model);

    }

    @Override
    public void internet() {
        System.out.println(model + " здійснює підключення до інтернету!");

    }

    @Override
    public void versionAndroid() {
        System.out.println("Версія програмного забезпечення " + version);
    }
    public String getModel() {
        return model;
    }
    public void setVersion(String version) {
        System.out.println("Проведено оновлення програмного забезпечення до версі " + version);
        this.version = version;

    }


}
