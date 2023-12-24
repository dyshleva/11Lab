package com.example.third;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage {
    private String file;

    @Override
    public void display() {
        RealImage img = new RealImage(this.file);
        img.display();
    }
}
