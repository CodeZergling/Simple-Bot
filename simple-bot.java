package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018"); 
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        String q1 = "1. To repeat a statement multiple times.\n";
        String q2 = "2. To decompose a program into several small subroutines.\n";
        String q3 = "3. To determine the execution time of a program.\n";
        String q4 = "4. To interrupt the execution of a program.\n";
        System.out.println(q1 + q2 + q3 + q4);

            for (int i = 1; i <= 4; i++) {
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Please, try again.");
                } else if (answer == 3) {
                    System.out.println("Please, try again.");
                } else if (answer == 4) {
                    System.out.println("Please, try again.");
                } else {

                }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
