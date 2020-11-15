package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //defining variables
        Scanner input = new Scanner(System.in);
        int randomIndex = (int) (Math.random() * 7);
        String[] wordList = {"deneme", "hangman", "algorithm", "hekim", "typescript", "python", "jupyterlab"};
        System.out.println("Adam Asmacaya Hosgeldiniz");
        System.out.println("Toplamda 6 tahmin hakkiniz bulunmakta. ");
        System.out.println("Iyi Sanslar :)");



            String userInput;
            String currentWord = wordList[randomIndex];
            int lengthOfWord = currentWord.length();
            System.out.println();
        System.out.println("Adam Asmacaya Hosgeldiniz");
        System.out.println("Toplamda 6 tahmin hakkiniz bulunmakta. ");
        System.out.println("Your secret word has " + lengthOfWord + " letters ");
        System.out.println("Iyi Sanslar :)");

            String placeholder = initialize(currentWord);
        printWord(placeholder);

            System.out.println();

            for (int i = 0; i < 6; i++) {
                System.out.print("Harf giriniz: ");
                userInput = input.next();

                int index = currentWord.indexOf(userInput);
                if (index != -1) {
                    System.out.println("Dogru Tahmin");
                    placeholder = placeholder.substring(0, index) + userInput + placeholder.substring(index + 1);
                    printWord(placeholder);
//
                } else {
                    System.out.println("Kotu Tahmin");
                }

                if (currentWord.equals(placeholder)) {
                    System.out.println();
                    System.out.println("Tebrikler Kazandiniz");
                    break;
                }
            }

            System.out.println("Kelimeniz: " + " " + currentWord);
            System.out.println();

        }


    private static String initialize(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    private static void printWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(word.charAt(i)).append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}


