package com.tommy;


import java.util.*;
import java.io.*;

public class Lab5Problem2 {

    public static void main(String[] args) throws IOException {


        int houses[] = new int[8]; //creates an array for the 8 houses
        Scanner s = new Scanner(System.in);
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("RecyclingCrates.txt"));//creates txt file

        for (int x = 0; x < houses.length; x++) { //loops through 8 times to ask each house for crates
            System.out.println("How many crates does house #" + x + " have for recycling?");
            houses[x] = s.nextInt();
        }



        //loops through houses to find min, max, and total crates
        int answers[] = new int[houses.length];
        int sum = 0;
        int min = 0;
        int max = 0;
        int maxHouse = 0;
        int minHouse = 0;
        for (int x = 0; x < answers.length; x++) {
            int numCrates = houses[x];

            if (x == 0) {
                min = numCrates;
                max = numCrates;
            }
            if (numCrates > max) {
                max = numCrates;
                maxHouse = x;
            }
            if (numCrates < min) {
                min = numCrates;
                minHouse = x;
            }
            sum = sum + houses[x];
            bufWriter.write("House " + x + " had " + numCrates + " crates recycled.\n\n");


        }
        //writes lines into txt file
        bufWriter.write("The total number of crates is: " + sum + "\n");
        bufWriter.write("House " + maxHouse + " recycled" + " the most crates.\n");
        bufWriter.write("House " + minHouse + " recycled" + " the least crates.\n");
        bufWriter.close();
        System.out.println("The total number of crates is: " + sum);
        s.close();
        System.out.println("The largest number of crates is: " + max);
        System.out.println("The smallest number of crates is: " + min);
        System.out.println("House #" + maxHouse + " had the most recycling with " + max + ".");
        System.out.println("House #" + minHouse + " had the smallest number of crates with " + min + ".");

    }

}