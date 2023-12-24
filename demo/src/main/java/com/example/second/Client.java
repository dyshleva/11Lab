package com.example.second;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private Gender sex;
    private int age;
    private String mail;

    public Client(String myname, int myage, Gender gender, String mymail) {
        this.name = myname;
        this.age = myage;
        this.sex = gender;
        id = counter++;
        this.mail = mymail;
    }
}