package com.company;

public class Author {
    private String name;
    private String email;
    private char gender = 77;

    public Author(){}
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        if(gender != 'm' && gender != 'f')
            throw new IllegalArgumentException("Недопустимый пол: "+ gender);
            this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author: "+this.name+", "+this.email+", "+this.gender+"";
    }
}


