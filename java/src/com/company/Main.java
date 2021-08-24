package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi there! \nWhats your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome "+name);
        System.out.println("What's your age");
        System.out.println("you'r age is "+input.nextInt());
        System.out.println(235_000_00);

    }
}
