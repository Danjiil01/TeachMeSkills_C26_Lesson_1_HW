package com.teachmeskills.lesson1;

import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello," + name + "!");
    }

}
