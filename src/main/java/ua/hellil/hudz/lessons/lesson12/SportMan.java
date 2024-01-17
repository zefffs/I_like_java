package ua.hellil.hudz.lessons.lesson12;

import ua.hellil.hudz.lessons.lesson10.Person;


public class SportMan {
    private final String name;
    private final int dayBorn;
    private final  String monthBorn;
    private final int yearBorn;
    private final String numberPhone;
    private final String email;

    private String surName;
    private double weight;
    private String pressure;
    private int stepsOfDay;
    private int age;


    public SportMan(String name, String surName, int dayBorn, String  monthBorn, int yearBorn,
                    String numberPhone, String email, double weight,
                    String pressure, int stepsOfDay) {
        this.name = name;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.numberPhone = numberPhone;
        this.email = email;
        this.surName = surName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsOfDay = stepsOfDay;
        this.age = 2023 - yearBorn;
    }

    public String getName() {
        return name;
    }

    public int getDayBorn() {
        return dayBorn;
    }

    public String  getMonthBorn() {
        return monthBorn;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getSurName() {
        return surName;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getStepsOfDay() {
        return stepsOfDay;
    }

    public int getAge() {
        return age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsOfDay(int stepsOfDay) {
        this.stepsOfDay = stepsOfDay;
    }

   void printAccountInfo(){

       System.out.println();
       System.out.println(this.name + " " + this.surName + ", " + "вік " + this.age + " р., " + "дата народження " + this.dayBorn + "."
               + this.monthBorn + "." + this.yearBorn);
       System.out.println("Контактні данні: " + "телефон " + this.numberPhone + "; " + "емейл " + this.email);
       System.out.println("Фізичні данні: Вага " + this.weight + "; " + "артеріальний тиск " + this.pressure + "; "
               + "пройдені кроки за день " + this.stepsOfDay);

    }



}
