package basics;

import java.util.Scanner;

public class Basisjava {

    // public void MudulerFofTen(
    // Scanner scanner) {
    // for (; true;) {
    // int number = scanner.nextInt();
    // if (number % 10 == 0) {
    // System.out.println("Number is muduler of 10 go outside the loop:" + number);
    // break;
    // }
    // System.out.println("Number is not muduler of 10:" + number);
    // }
    // scanner.close();
    // }

    // public void MudulerFofTenContinue(
    // Scanner scanner) {
    // for (; true;) {
    // System.out.print("Enter the number: ");
    // int number = scanner.nextInt();
    // if (number % 10 == 0) {
    // System.out.println("Number is muduler of 10 continue: " + number);
    // if (number == 0) {
    // break;
    // }
    // continue;
    // }
    // System.out.println("Number is not muduler of 10:" + number);
    // }
    // scanner.close();

    // }
    // public void MudulerFofTenContinue(
    // Scanner scanner) {
    // for (; true;) {
    // System.out.print("Enter the number: ");
    // int number = scanner.nextInt();
    // if (number % 10 == 0) {
    // System.out.println("Number is muduler of 10 continue: " + number);
    // if (number == 0) {
    // break;
    // }
    // continue;
    // }
    // // System.out.println("Number is not muduler of 10:" + number);
    // }
    // scanner.close();
    // }

    // note:0,1 is not prime number
    // public void isPrime(Scanner scanner) {
    // for (; true;) {
    // System.out.print("Enter the number: ");
    // int number = scanner.nextInt();
    // boolean isPrime = true;
    // if (number == 0) {
    // break;
    // }
    // for (int i = 2; i < Math.sqrt(number); i++) {
    // if (number % i == 0) {
    // isPrime = false;
    // // break;
    // }
    // }
    // if (isPrime == true && number > 1) {
    // System.out.println("Number is prime: " + number);
    // } else {
    // System.out.println("Number is not prime: " + number);
    // }
    // }
    // scanner.close();
    // }

    // public void factorial(Scanner scanner) {
    // // for (; true;) {
    // System.out.print("Enter the number: ");
    // int number = scanner.nextInt();

    // // if (number == 0) {
    // // break;
    // // }
    // int fact = 1;
    // for (int i = 1; i <= number; i++) {
    // fact = fact * i;
    // }
    // System.out.println("Factorial of number is: " + fact);
    // // }
    // scanner.close();
    // }
    // ========================================
    public static int facto(int f) {
        int number = 1;
        for (int i = 1; i <= f; i++) {
            number = number * i;
        }
        return number;
    }

    public void binomialCoficiant(int n, int r) {

        int nfact = facto(n);
        int rfact = facto(r);
        int nmrfact = facto(n - r);
        int result = nfact / (rfact * nmrfact);
        System.out.println("Binomial coficiant is: " + result);

    }

    public void BaiCoficant(Scanner scanner) {
        System.out.print("Enter the value of n ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r ");
        int r = scanner.nextInt();
        binomialCoficiant(n, r);
        scanner.close();
    }
    // ===========================
}