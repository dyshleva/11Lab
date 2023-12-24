package com.example.third;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class RealImage implements MyImage {
    private JFrame frame;

    public RealImage(String filename) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }
}