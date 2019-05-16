package hackerrank;

import java.util.*;



public class HackerRankJavaIfElse {

    public static void main(String[] args) {
        weirdNotWeird(10);
    }

    static void weirdNotWeird(int num){
        Scanner scanner = new Scanner(System.in);

         num = scanner.nextInt();

        if (num % 2 == 1) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && num >= 2 && num <= 5) {
            System.out.println("Not Weird");
        } else if (num % 2 == 0 && num > 6 && num < 20) {
            System.out.println("Weird");
        } else {
            System.out.print("Not Weird");
        }
    }
}







