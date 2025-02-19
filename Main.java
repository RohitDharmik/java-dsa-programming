import java.util.Scanner;

// import basics.Patterns;

import basics.Patterns;
import basics.Basisjava;

public class Main {
    public static void main(String[] args) {
        // System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // // int age = sc.nextInt();
        // System.out.println("my name is " + name);
        // Table table = new Table();
        // // table.Mulltiple(sc);
        // // table.BiggerNumber(sc);
        // table.ClassTopper(sc);

        // sc.close();

        // Patterns pattern = new Patterns();
        // pattern.printStarsTrangle();
        // pattern.printInvertStarsTrangle();
        // pattern.printSideStarsTrangle();
        // pattern.printUviStarsTrangle();
        // pattern.printCenterStarsTrangle();

        Basisjava basisjava = new Basisjava();
        // basisjava.MudulerFofTen(sc);
        // basisjava.MudulerFofTenContinue(sc);
        // basisjava.isPrime(sc);
        // basisjava.factorial(sc);
        // basisjava.BaiCoficant(sc);
        // basisjava.primeinRange(sc);
        basisjava.binaryNumber(sc);
    }
}
