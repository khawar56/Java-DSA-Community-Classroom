package com.company;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        //Questions
        factorial();
        average_of_numbers();
        power();

    }

    public class scanner{
       static Scanner input = new Scanner(System.in);
    }

    static void factorial(){
        System.out.println("Enter a number to calculate factorial of");
        int number = scanner.input.nextInt();
        if(number==0){
            System.out.println("Factorial = 0");
            return;
        }
        int factorial = 1;
        while(number>0){
            factorial = factorial * number;
            number -= 1;
        }
        System.out.println("Factorial = "+factorial);
    }

    static void average_of_numbers(){
        System.out.println("How many numbers you want to take average of?");
        int numbers = scanner.input.nextInt();
        float sum = 0;
        for(int i = 0; i<numbers;i++){
            System.out.println("Enter number : "+(i+1));
            int num = scanner.input.nextInt();
            sum = sum+num;
        }
        System.out.println("Average is : "+sum/numbers);
    }

    static void power(){
        System.out.println("Enter the number you want to take power of");
        float number = scanner.input.nextFloat();
        System.out.println("Enter the power value");
        int power = scanner.input.nextInt();
        float power_number = number;
        for(int i =0;i<power-1;i++){
            power_number = power_number *number;
        }
        System.out.println("Power "+power+" of number "+number+" is : "+power_number);
    }

}
