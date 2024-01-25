package ua.hellil.hudz.lessons.lesson14;

public class IPhones implements Smartphones, IOS {
    private String version;
    private String model;


    public IPhones(String model) {
        this.version = "iOS 16.7.5 і iPadOS 16.7.5";
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
    public void versionIos() {
        System.out.println("Версія програмного забезпечення " + version);

    }

    public String getModel() {
        return model;
    }

    public void setVersion(String version) {
        System.out.println("Проведено оновлення програмного забезпечення до версі " + version);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
