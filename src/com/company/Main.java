package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hi who are you?");
        String n = input.nextLine();
        System.out.println("Hello, " + n + " nice to meet you.");
        System.out.println("How long have you been at howard?");
        int y = input.nextInt();
        System.out.println("Congratulation on your first week of your year " + (y+1) + " at howard" );
        System.out.println("What is your gpa?");
        float g = input.nextFloat();
        System.out.println(g + "! What a nice gpa!");
    }
}
