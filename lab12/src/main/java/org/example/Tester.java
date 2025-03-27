package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Имя: " + name + ", Фамилия: " + surname +
                    ", Опыт: " + experienceInYears +
                    ", Уровень Английского: " + englishLevel +
                    ", ЗП: $" + salary);
        } else {
            displayInfo();
        }
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname);
    }

    public static void printDefaultTester() {
        System.out.println("Стандартный тестер: Имя: Иван, Фамилия: Иванов");
    }
}



