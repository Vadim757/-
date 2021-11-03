package ru.practice_10.ten_one;

public class Complex {
    private final int real;
    private final int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        this.real = 1;
        this.image = 1;
    }

    @Override
    public String toString() {
        if (image == 0) return real + "";
        if (real == 0) return image + "i";
        if (image < 0) return real + " - " + (-image) + "i";
        return real + " + " + image + "i";
    }
}
