package com.example.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles").age(32).gender("m").mark(61).mark(100)
                .grades(Arrays.asList(61, 62))
                .build();
        System.out.println(user);
    }
}
