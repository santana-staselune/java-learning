package lv.acodemy;

import java.util.Arrays;

public class ThirdLesson {
    public static void main(String[] args) {
        // Conditional operators in Java

        // if (is, has -> isRaining, isRandomNumber, hasEvenValue)
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Take an umbrella!");
        }

        int temperature = 30;
        if (temperature > 29) {
            System.out.println("It is too hot!");
        }

        // AND (&&)
        if (4 > 2 && 10 < 11) {
            System.out.println("Both are equals!");
        }

        // OR (||)
        if (4 < 2 || 10 > 11) {
            System.out.println("Execute this code");
        }

        // if-else ...
        boolean isWeekDay = true;

        if (isWeekDay) {
            System.out.println("Working today....");
        } else
            System.out.println("Will stay at home!");


        int number = 11;
        // %
        // + - / * (

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else
            System.out.println("Odd number");

        // if age => 18 -> Access granted
        //In all other cases -> Access denied

        int age = 18;
        if (age >= 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
        //if-else-if-else
        int hour = 12;
        if (hour == 5) {
            System.out.println("Will go for run");
        } else if (hour == 7) {
            System.out.println("Will have breakfast");
        } else if (hour == 9) {
            System.out.println("Will start work");
        } else {
            System.out.println("Free time");
        }


        int score = 129;
        if (score >= 90) {
            System.out.println("Perfect");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }


        int ageB = 56;
        if (ageB > 0 && ageB <= 6) {
            System.out.println("Baby");
        } else if (ageB >= 7 && ageB <= 17) {
            System.out.println("Shkilla");
        } else if (ageB >= 18 && ageB <= 65) {
            System.out.println("Adult");
        } else {
            System.out.println("pens");
        }


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Number:" + i + " is even number");
            }
        }

        int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
            System.out.println(sum);

        int[] arr = new int[21];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 3 and 5");
            } else if (num % 3 == 0) {
                System.out.println("Number: " + num + " can be divided by 3");
            } else if (num % 5 == 0) {
                System.out.println("Number: " + num + " can be divided by 5");
            } else {
                System.out.println("Numbers: " + num + "can't be divided by 3 or 5");
            }
        }


        }
    }




