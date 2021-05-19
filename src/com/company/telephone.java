package com.company;
import java.util.Scanner;
public class telephone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your ip address. numbers must be written in dots");
        String input = in.nextLine();
        boolean ip = input.matches("([0-9]\\.|[0-9][0-9]\\.|1[0-9][0-9]\\.|2[0-4][0-9]\\.|25[0-5]\\.){3}([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
        if(ip){
            System.out.println("you entered the correct ip address");
        }
        else{
            System.out.println("you entered an incorrect ip address! try again.");
        }

    }
}