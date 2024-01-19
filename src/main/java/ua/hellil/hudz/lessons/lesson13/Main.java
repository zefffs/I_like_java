package ua.hellil.hudz.lessons.lesson13;

public class Main {
    public static void main(String[] args) {


        MusicStyles [] groups = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles group : groups){
            group.playMusic();
        }
    }
}
// Зробіть клас MusicStyles, який міститиме метод playMusic()
// Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
// Спадкоємці повинні реалізовувати метод playMusic().
// У мейн-класі створіть музичні гурти для кожного стилю
// За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()
