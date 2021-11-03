package ru.practice_10.ten_two;

public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Ugh! Comfortable chair!");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Client{" +
                "chair=" + chair +
                '}';
    }
}
