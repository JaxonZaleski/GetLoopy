import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Count: up 1, 0-30");
        for (int count = 0; count <= 30; count++) {
            System.out.print(count + " ");
        }
        System.out.println();

        System.out.println("Count: down 1, 30-0");
        for (int count = 30; count >= 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();

        System.out.println("Count: up 3, 0-18");
        for (int count = 0; count <= 18; count+=3) {
            System.out.print(count + " ");
        }
        System.out.println();

        System.out.println("Count: down 2, 10-0");
        for (int count = 10; count >= 0; count-=2) {
            System.out.print(count + " ");
        }
        System.out.println();

        System.out.println("Nested: Stars");
        for (int count = 1; count <= 5; count++) {
            if (count == 1) {
                System.out.println("*");
            } else if (count == 2) {
                System.out.println("**");
            } else if (count == 3) {
                System.out.println("***");
            } else if (count == 4) {
                System.out.println("****");
            } else {
                System.out.println("*****");
            }
        }

        System.out.println("Nested: Stars reversed");
        for (int count = 5; count >= 1; count--) {
            if (count == 5) {
                System.out.println("*****");
            } else if (count == 4) {
                System.out.println("****");
            } else if (count == 3) {
                System.out.println("***");
            } else if (count == 2) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
        }

        System.out.println("Nested: Stars bland");
        for (int count = 5; count >= 1; count--) {
            System.out.println("*****");
        }

        Random rand = new Random();
        Scanner in = new Scanner (System.in);
        boolean done = false;
        int finished = 0;

        System.out.println("Roll   |   Die1   |   Die2   |   Die3   |   Sum");
        System.out.println("-------------------------------------------------");
        do {
            int loopCount = 0;
            do {
                int die1 = rand.nextInt(1, 7);
                int die2 = rand.nextInt(1, 7);
                int die3 = rand.nextInt(1,7);
                int sum = 0;


                loopCount = loopCount + 1;
                sum = die2 + die1 + die3;
                System.out.printf(loopCount + "   |   " + die1 + "   |   " + die2 + "   |   " + die3 + "   |   " + sum);
                System.out.println("");
                if (die1 == die2) {
                    if (die1 == die3) {
                        done = true;
                    }
                } else {
                    done = false;
                }
            } while (!done);
            System.out.println("Do you wish to leave? Type -1 else type any other number to continue.");
            done = false;
            do {
                if (in.hasNextInt()) {
                    finished = in.nextInt();
                    in.nextLine();
                    done = true;
                } else {
                    System.out.println("You must enter a number.");
                    in.nextLine();
                }
            } while (!done);
        } while (finished != -1);
    }
}