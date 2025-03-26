package org.example;

public class Main {
    public static void main(String[] args) {
        Tester.printDefaultTester();

        Tester tester1 = new Tester("Иван", "Лобач");
        tester1.displayInfo();

        Tester tester2 = new Tester("Иван", "Смолич", 5, "A2", 1500.0);
        tester2.displayInfo(true);

        tester2.displayInfo("Специалист");
    }
}
