package org.lessons.java;
public class FizzBuzz {
    public static void main(String[] args) {

        // Inizializzo il count da 1 a 100 e stabilisco le condizioni
        for (int number = 1; number <= 100; number++) {

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (number % 3 == 0) {
                System.out.println("Fizz");

            } else if (number % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(number);
            }
        }
    }
}
