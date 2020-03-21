package org.fasttrackit;


import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String userName = new String();

        System.out.println("What is your name?" + userName);
        userName = myObj.nextLine();

        System.out.println("Hello, " + userName + " nice to meet you!");
    }
}
