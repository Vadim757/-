package com.company;

public class Student {
    private String name;
    private String phone;
    private int mark;
    private int ID;

    public Student() {

    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(int ID, String name, String phone, int mark) {
        this.name = name;
        this.phone = phone;
        this.mark = mark;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", mark=" + mark +
                ", ID=" + ID +
                "}\n";
    }
}


