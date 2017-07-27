package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        double pi;
        Scanner in;

        pi = 3.14;
        in = new Scanner(System.in);

        System.out.println("Enter a Radius");
        radius = in.nextDouble();
        pi = 3.14;

        area = pi * radius * radius;
        System.out.println("The Area is:" + area);

    }
}
