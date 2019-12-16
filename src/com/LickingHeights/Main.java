package com.LickingHeights;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;
        // Random sentence generator

// names
       // String[] FirstName = {"-Aaran", "-Baily", "-Caden", "-Dafni", };
        //String[] MiddleName = {" Louise", " Rose", " Grace", " Jane"};
        //String[] LastName = {" Kilpatrick", "Smith", " Brown", " Miller",};



        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        //Pattern1();
        //Pattern2();
        //Pattern3();
        //Pattern4();
        //Pattern5();
        //System.out.println(" sumMethod of array is " + sumMethod(array));
       //System.out.println("The MIN of the array is " + MIN(array));
        //System.out.println("The maximum of the array is " + Max(array));
        //printArray(array);
        //System.out.println("After bubble sort");
        //printArray(bubbleSort(array));
        String[] verb = {"climbing", "hurtling", "eating", "running"};
        String[] places = {"School", "House", "Field", "Seeker City"};
        String[] times = {"High Noon", "Morning", "Evening", "MidNight"};
        String[] things = {"Canned coochie", "Dry Erase Marker", "lamp", "Female Dog"};
        String[] people = {"Billy Bob Joe", "Doggo", "Bob Ross", "Stan Lee"};
        String[] adjectives = {"red", "scary", "hairy", "fierce"  };
        sentenceGenerator(verb,places, times, people, adjectives, things );
        //printName(FirstName, MiddleName, LastName);



    }


    public static void Pattern1() {
        for (int rowes = 0; rowes < 6; rowes++) {

            for (int colums = 0; colums < 6; colums++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int rowes = 1; rowes < 7; rowes++) {

            for (int colums = 0; colums < 7; colums++) {
                System.out.print(rowes);


            }
            System.out.println();
        }
    }

    public static void Pattern3() {
        for (int times = 1; times < 7; times++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);


            }
            System.out.println();
        }
    }

    public static void Pattern4() {
        for (int rowes = 1; rowes < 7; rowes++) {


            for (int columns = 1; columns <= rowes; columns++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }

    public static void Pattern5() {
        for (int times = 1; times < 7; times++) {


            for (int columns = 1; columns <= times; columns++) {
                System.out.print(columns);


            }
            System.out.println();
        }
    }

    public static int sumMethod(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int MIN(int[] array) {
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minimum < array[i]) {
                array[i] = minimum;
            }

            minimum = array[i];
        }
        return minimum;
    }

    public static int Max(int[] array) {
        int maximum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maximum > array[i]) {
                array[i] = maximum;
            }

            maximum = array[i];
        }
        return maximum;
    }

    public static int[] bubbleSort(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static String randomWord(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];

    }
    public static void sentenceGenerator(String[] verb, String[] places, String[] times, String[] people, String[] adjectives, String[] things ) {

        System.out.print( "I was " +randomWord(verb)+ " down the " +randomWord(places)+
                " around " +randomWord(times)+ " with my best friend " +randomWord(people)+
                " and we "+randomWord(verb)+ " a "+randomWord(adjectives) + " " + randomWord(things)+
                " that was "+randomWord(verb)+ " "+ randomWord(things)+"s");

    }
    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

}
