package com.sdajava.liczby_automorficzne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe, ktora chcesz sprawdzic: ");
        int n = scanner.nextInt();

        System.out.println("Podaj podstawe liczby: ");
        int m = scanner.nextInt();

        int a;
        int b = m;

        while (n > b) {
            b = b * m;
        }

        a = (int) Math.pow(n, 2) % b;

        if (a == n) {
            System.out.println("Liczba: " + n + " jest liczba automorficzna");
        } else {
            System.out.println("Liczba: " + n + " nie jest liczba automorficzna");
        }
    }
}