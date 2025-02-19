package basics;

import java.util.ArrayList;
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
    // public static int facto(int f) {
    // int number = 1;
    // for (int i = 1; i <= f; i++) {
    // number = number * i;
    // }
    // return number;
    // }

    // public void binomialCoficiant(int n, int r) {

    // int nfact = facto(n);
    // int rfact = facto(r);
    // int nmrfact = facto(n - r);
    // int result = nfact / (rfact * nmrfact);
    // System.out.println("Binomial coficiant is: " + result);

    // }

    // public void BaiCoficant(Scanner scanner) {
    // System.out.print("Enter the value of n ");
    // int n = scanner.nextInt();
    // System.out.print("Enter the value of r ");
    // int r = scanner.nextInt();
    // binomialCoficiant(n, r);
    // scanner.close();
    // }
    // ===========================

    // public void primeinRange(Scanner scanner) {
    // System.out.println("Enter the range of prime number: ");
    // int startrange = scanner.nextInt();
    // int endrange = scanner.nextInt();

    // ArrayList<Integer> primeInRange = new ArrayList<Integer>();
    // for (int i = startrange; i <= endrange; i++) {
    // boolean isPrime = true;
    // if (i > 2) {
    // for (int j = 2; j < Math.sqrt(i); j++) {
    // if (i % j == 0) {
    // isPrime = false;

    // }
    // }

    // } else if (i == 0 || i == 1) {
    // isPrime = false;
    // }
    // if (isPrime) {
    // primeInRange.add(i);
    // System.out.println("Prime number is: " + i);
    // }
    // }
    // System.out.println("Prime number in range: " + primeInRange.toString());
    // scanner.close();

    // }

    // ---------------------------------------
    // public void primeinRange(Scanner scanner) {
    // System.out.println("Enter the range of prime number: ");
    // int startrange = scanner.nextInt();
    // int endrange = scanner.nextInt();
    // if (startrange < endrange) {
    // ArrayList<ArrayList<Integer>> primes = isPrime(startrange, endrange);
    // System.out.println("Prime number in range: " + primes.get(0).toString());
    // System.out.println("Non Prime number in range: " + primes.get(1).toString());
    // // block of code to be executed if the condition is true
    // } else {

    // System.out.println("Start range should be less than end range");
    // // block of code to be executed if the condition is false

    // }

    // scanner.close();
    // }

    // public static ArrayList<ArrayList<Integer>> isPrime(int s, int e) {
    // ArrayList<Integer> primeInRange = new ArrayList<Integer>(), nonPrimeInRange =
    // new ArrayList<Integer>();

    // for (int i = s; i <= e; i++) {
    // Boolean isPrime = true;
    // if (i > 2) {
    // for (int j = 2; j < i; j++) {
    // if (i % j == 0) {
    // isPrime = false;
    // }
    // }

    // } else if (i == 0 || i == 1) {
    // isPrime = false;
    // }

    // if (isPrime) {
    // primeInRange.add(i);
    // } else {
    // nonPrimeInRange.add(i);
    // }
    // }
    // ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    // result.add(primeInRange);
    // result.add(nonPrimeInRange);
    // return result;
    // }
    // ---------------------------------------
    // binary number
    public void binaryNumber(Scanner scanner) {
        for (; true;) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            int binary = 0;
            int num = number;
            int pow = 0;
            if (number > 1) {

                for (; num > 0; pow++) {
                    int rem = num % 2;
                    binary = binary + rem * (int) Math.pow(10, pow);
                    num = num / 2;
                }

            } else {
                binary = 1;

            }

            System.out.println("binary number is: " + binary);
        }

    }
}