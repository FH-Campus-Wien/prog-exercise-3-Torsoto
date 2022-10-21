package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }

    public static void oneMonthCalendar(int days, int start) {
        int x = 0;
        for (int i = 1; i < start; i++) {
            System.out.print("   ");
            x++;
            if (x == start) {
                System.out.println();
            }
        }
        for (int j = 1; j <= days; j++) {
            System.out.printf("%2d", j);
            System.out.print(" ");
            x++;
            if (x % 7 == 0) {
                System.out.println();
            }
        }
        if (days == 28) {
            System.out.println();
        }
    }

    public static long[] lcg(long x) {
        long m = (long) Math.pow(2, 31);
        int a = 1103515245;
        int c = 12345;

        long[] ar = new long[10];
        ar[0] = ((a * x) + c) % m;

        for (int i = 1; i < ar.length; i++) {
            ar[i] = (a * ar[i - 1] + c) % m;
        }
        return ar;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner sc = new Scanner(System.in);
        int y = 1, input;
        do {
            input = sc.nextInt();
            System.out.print("Guess number " + y + ": ");
            if (y == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            } else if (input > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (input < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            } else {
                System.out.println("You won wisenheimer!");
            }
            y++;
        } while (y != 11 && input != numberToGuess);
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    public static boolean swapArrays(int[] x, int[] y) {
        int[] z = new int[x.length];
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
            x[i] = y[i];
            y[i] = z[i];
        }
        return true;
    }

    public static String camelCase(String s) {
        char[] sChars = s.toCharArray();
        StringBuilder sCharsNew = new StringBuilder();

        for (int i = 0;i<sChars.length;i++){
            if (sChars[i] >= 65 && sChars[i]<= 90){
                sChars[i] += 32;
            }
            if (sChars[i] == ' '){
                i++;
                if (sChars[i]>=97 && sChars[1]<=122){
                    sChars[i] -= 32;
                }
            }
            if (i==0){
                if(sChars[0] >= 97 && sChars[i]<=122){
                    sChars[i] -= 32;
                }
            }
        }
        for (char x: sChars) {
            if (x>= 97 && x<=122 || x>=65 && x<=90){
                sCharsNew.append(x);
            }
        }
        return sCharsNew.toString();
    }
    public static int checkDigit (int[] x){
        int a,c = 0,d;

        for (int i = 0; i < x.length;i++){
            a = i+2;
            c += a * x[i];
        }
        d = c%11;
        a = 11-d;
        if (a==10){
            a=0;
        }
        if (a==11){
            a=5;
        }
        return a;
    }
}