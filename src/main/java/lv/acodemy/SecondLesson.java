package lv.acodemy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[5]; // [0, 0, 0, 0 , 0]
        String[] names = {"John", "Andrey", "Mark"}; // [John, Andrey, Mark]
        // index: [0] - John
        // index: [1] - Andrey
        // index: [2] - Mark

        int[] ages = {19, 20, 30, 41, 50};
        // index: [0] - 19
        // index: [1] - 20
        // index: [2] - 30
        // index: [3] - 41
        // index: [4] - 50

        String[] fruitBasket = new String[10];

        // Element access
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 40;
        numbers[3] = 70;
        numbers[4] = 100;
        System.out.println(Arrays.toString(numbers));

        // Exercise:
        // Full-fil fruitBasket with the fruits
        fruitBasket[0] = "watermelon";
        fruitBasket[1] = "bananas";
        fruitBasket[2] = "pear";
        fruitBasket[3] = "grape";
        fruitBasket[4] = "melon";
        fruitBasket[5] = "berries";
        fruitBasket[6] = "strawberry";
        fruitBasket[7] = "pineapple";
        fruitBasket[8] = "orange";
        fruitBasket[9] = "kiwi";
        System.out.println(Arrays.toString(fruitBasket));

        var currentDay = 14;
        System.out.println(currentDay);

        // Loops
        // Print hello world 5 times;
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("========");

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + " index: " + i);
        }

        for (int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        // for each;
        for (String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // Create int number array from 0 -> to 10;
        // Print in reverse order;

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        // Concatenation
        String myName = "Nikita";
        String mySurname = "Milka";
        int myAge = 30;
        System.out.println("n");
        // My name is Nikita Milka. I am 30 years old.
        System.out.println("My name is " + myName + " " + mySurname + ". I am " + myAge + " years old.");
        // String.format();
        System.out.println(
                String.format("My name is %s %s. I am %d years old", myName, mySurname, myAge));

        String template = """
                My name is %s %s. I am %d years old""";
        System.out.println(String.format(template, myName, mySurname, myAge));

        // while loops


        //while loops
        /*
        while (condition){
        //loop body
        }
        */
        int i = 0;
        while (i < 5) {
            System.out.println("Number: " + i);
            i++;
        }


        Scanner scanner = new Scanner(System.in);
        String password = "";
        /*
        string password = "123";
        passwordl.equals("123") = true!
        !password.equals("123") = false

         */
        while (!password.equals("secret")) {
            System.out.println("Enter your password");
            password = scanner.nextLine();
        }
        System.out.println("Access granted");


        /* int randomNumber = new Random().nextInt(0, 11);
    {System.out.println("Random number: " + randomNumber);}
    int guess;
    Scanner myScanner = new Scanner(System.in);
        do {
        System.out.println("Guess number from 1 to 10");
        guess = myScanner.nextInt();
    } while (guess != randomNumber);

    {System.out.println("Guessed!");}*/

        //vivesti tablicu umnozenija na 5
        //do 10
        //poschitaty summu chisel ot 1 do 100;
        //while: vivesti chisla ot 10 do 1;

           /* int umn = 10;
            for(int i = umn.length - 1; i >= 0; i--); {
        System.out.print(i * 5);
    }*/

        //Tablica umnozhenija na 5
      /*  System.out.println("Task 1");
    int result;
        for (int i = 1; i < 11; i++){
        result = 5 * i;
        System.out.println("5 * " + i + " = " + result);
    }
        System.out.println(" ");

    // summa chisel ot 1 so 100
        System.out.println("Task 2");
    int sum = 0;
        for (int i = 1; i < 101; i++){
        sum = i + sum;
    }
        System.out.println("Summa chisel ot 1 do 100: " + sum);
        System.out.println(" ");

    // vivesti chisla ot 10 do 1 (while)
        System.out.println("Task 3");
    int j = 10;
        while (j>0){
        System.out.print(j+ " ");
        j--;*/
    }
    }

