package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast et binært tal: ");
        String num = input.nextLine();
        System.out.println("Tallet som decimaltal: " + Integer.parseInt(num, 2));
    }
}
