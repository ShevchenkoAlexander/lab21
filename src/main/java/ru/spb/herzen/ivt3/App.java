package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("№1");
        String[] mas = new String[15];
        String[] masUP = new String[15];
        for (int i=0; i<15; i++) {
            mas[i] = rnd.next();
            System.out.println("Hello, "+mas[i]);
        }

        System.out.println("\n№2");
        Arrays.sort(mas);
        for (String orderedArrEl: mas) {
            System.out.println(orderedArrEl);
        }

        System.out.println("\n№3");
        for (int i=2; i<5; i++) {
            System.out.println("Hello, "+mas[i]);
        }

        System.out.println("\n№4");
        for (int i=0; i<15; i++) {
            masUP[i] = mas[i].toUpperCase();
            System.out.println(masUP[i]);
        }

        System.out.println("\n№5");
        int[] numbers = new int[30];
        int even = 0;
        for (int i=0; i<30; i++) {
            numbers[i] = (int) (1 + Math.random()*100);
            System.out.println(numbers[i]);
            if (numbers[i]%2==0) {
                even +=1;
            }
        }
        System.out.println("Четных: " + even);


        System.out.println("\n№6");
        String myName = "Alexander";
        char[] chName = myName.toCharArray();
        Arrays.sort(chName);
        for (char Char: chName) {
            System.out.print(Char + " ");
        }


        System.out.println("\n№7");
        String vowels = "aeiou";
        char[] vowels_arr = vowels.toCharArray();
        myName = "Alexander";
        chName = myName.toCharArray();
        int amount = 0;
        for (char x: chName) {
            for (char y: vowels_arr) {
                if (x == y) {
                    amount ++;
                }
            }
        }
        System.out.print("Amount of vowels in the name: " + amount);
    }
}