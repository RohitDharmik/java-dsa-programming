package basics;

public class Patterns {
    // *
    // * *
    // * * *
    // * * * *
    // public static void printStarsTrangle() {
    // int n = 4;
    // for (int i = 0; i <= n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(" * ");
    // }
    // System.out.println(" ");
    // }

    // }

    // * * * *
    // * * *
    // * *
    // *
    // public static void printInvertStarsTrangle() {
    // int n = 4;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n-i; j++) {
    // System.out.print(" * ");
    // }
    // System.out.println("");
    // }
    // }

    // 1 1 1 *
    // 1 1 * *
    // 1 * * *
    // * * * *
    // 1= " "
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // public static void printSideStarsTrangle() {
    // int n = 4;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {

    // System.out.print("*");
    // }
    // System.err.println(" ");
    // }
    // }

    // * * * *
    // 1 * * *
    // 1 1 * *
    // 1 1 1 *
    public static void printUviStarsTrangle() {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {

                System.out.print("*");
            }
            System.err.println(" ");
        }
    }

    // 1 1 1*
    // 1 1 * * 1
    // 1 1* * *
    // 1 * * * *

    public static void printCenterStarsTrangle() {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print(" * ");
            }
            System.err.println(" ");
        }
    }
}
