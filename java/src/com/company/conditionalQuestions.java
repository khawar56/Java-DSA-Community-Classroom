package com.company;

import java.util.Scanner;

public class conditionalQuestions {

    //declaring scanner once for using in multiple functions
    public class scanner{
        public static Scanner input = new Scanner(System.in);
    }

    //Question 1
    // take input three numbers, Find largest
    static void findLargest(){

        System.out.println("Enter first number");
        int num1 = scanner.input.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.input.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.input.nextInt();

        int max = num1;

        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println("Largest number is "+max);

        //or
        //using Math max function

        int max2 = Math.max(num3,Math.max(num1,num2));
        System.out.println("using Math.max --> Largest number is "+max2);


    }

    //Question 2
    //check if character is lower case or upper
    static void caseCheck(){
        System.out.println("Enter a character!");
        char ch = scanner.input.next().trim().charAt(0);
        if(ch>'Z'){
            System.out.println("Character "+ch+" is small");
        }
        else{
            System.out.println("Character "+ch+" is capital");
        }
    }

    //Question 3
    //Find n-th fibonacci term
    static void fibonacci(){
        System.out.println("Enter the n-th term");
        int n = scanner.input.nextInt();
        int a = 0;
        int b = 1;
        int term = 0;
        for(int i = 0; i<=n-2;i++){
            term = a + b;
            a = b;
            b = term;
        }
        System.out.println("n-th term is "+term);
    }

    //Question 4
    //Find occurrences of a number within a number
    static void countOccurrences(){

        System.out.println("Enter a number");
        String number = scanner.input.next();
        System.out.println("Enter a number to find occurrences of");
        char find = scanner.input.next().charAt(0);
        System.out.println("find number = "+find);
        int count = 0;

        for(int i =0; i <= String.valueOf(number).length()-1;i++){

            if(find== number.charAt(i)){
                count++;
            }
        }
        System.out.println("Number repeated "+count+" times");


        //or using mod and divide without string conversion

        System.out.println("using mod and divide");
        System.out.println("Enter number");
        int number2 = scanner.input.nextInt();
        System.out.println("Enter number to find");
        int find2 = scanner.input.nextInt();
        int count2 = 0;

        while(number2>0){
            if(number2%10 == find2){
             count2 ++;
            }
            number2 = number2/10;
        }

        System.out.println(("Occurrence = "+count2));
    }

    //Question 5
    //Reverse the given number
    static void reverse(){
        System.out.println("Enter a number to reverse");
        int number = scanner.input.nextInt();
        String reverse = "";
        while(number>0){
            reverse = reverse+number%10;
            number = number/10;
        }
        System.out.println(Integer.parseInt(reverse));

        //or without using Strings

        System.out.println();
        System.out.println("Without using String cast");
        System.out.println("Enter a number to reverse");
        int number2 = scanner.input.nextInt();
        int reverse2 = 0;
        while(number2>0){
            reverse2 *= 10;
            reverse2 += number2%10;
            number2 = number2/10;
        }
        System.out.println(reverse2);

    }

    public static void main(String[] args) {

        //Questions
        findLargest();
        caseCheck();
        fibonacci();
        countOccurrences();
        reverse();
    }

}
