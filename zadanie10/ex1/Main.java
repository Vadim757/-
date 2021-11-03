package ru.practice_10.ten_one;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complex = concreteFactory.CreateComplex(10,-2);
        System.out.println(complex);
    }
}
