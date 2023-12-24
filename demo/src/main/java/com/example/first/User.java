package com.example.first;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString

public class User {
    private String name;
    private int age;
    private String gender;
    private int weight;
    private int height;
}
