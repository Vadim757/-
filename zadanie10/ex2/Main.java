package ru.practice_10.ten_two;

public class Main {
    public static void main(String[] args) {
        Client client= new Client();

        ChairFactory chairFactory= new ChairFactory();
        FunctionalChair functionalChair=chairFactory.createFunctionalChair();
        MagicChair magicChair=chairFactory.createMagicChair();
        VictorianChair victorianChair = chairFactory.createVictorianChair();

        System.out.println(functionalChair.sum(12,13));
        magicChair.doMagic();
        client.sit();
        System.out.println(victorianChair);
    }
}
