package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Degree C ");
        float tempC = input.nextFloat();
        System.out.println("Temperature in Degree F is "+ ((tempC * 9/5)+32));

    }
}
