package ru.vsu.cs.avdeeva_p_a;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printNumberSentences(readText());
    }

    private static String readText() {
        System.out.println("Write a text to number his sentences :\n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printNumberSentences(String text) {
        System.out.println("\nFinished numbered text :\n" + NumberingOfSentences.numberingOfSentences(text));
    }

}