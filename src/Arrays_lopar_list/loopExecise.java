package Arrays_lopar_list;

import java.util.Scanner;

public class loopExecise {
    public static void main(String[] args) {

    }

    public static void LoopExercise () {

        //print the factorial value of anny input number by  the user.

        Scanner input = new Scanner(System.in);
        System.out.println("enter a positiv number ");

        int number = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++){

            fact *=i;
        }

        System.out.println("the factorial number of your " + number + " is " + fact);

    }

    public static void Powerdemo(){

        /*Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
         */

        System.out.println("enter a exponent ");
        Scanner scanner = new Scanner(System.in);

        int exponent = scanner.nextInt();

        System.out.println("enter a base ");

        int base = scanner.nextInt();

        int result = 1;

        for (int i = 1; i<= exponent; i++ ){
            result =  result * base;
        }
        System.out.println("result " + result);



    }
    public static void reverseNumber (){
        // take the user input and reverse it

        int number = 12345;
        int remainderNumber, reverseNumber = 0;

        while (number > 0) {

            remainderNumber = number % 10;

            number = number / 10;

            reverseNumber = (reverseNumber * 10) + remainderNumber;

        }
        System.out.println(reverseNumber);

    }



}