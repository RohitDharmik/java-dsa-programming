package basics;
import java.util.Scanner;

class Table {

    public void Mulltiple(Scanner scanner) {

        // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + number + " = " + i * number);
        }
        scanner.close();
    }

    // public void BiggerNumber(Scanner scanner) {
    // System.out.println("Enter a = ");
    // int a = scanner.nextInt();
    // System.out.println("Enter b = ");
    // int b = scanner.nextInt();
    // System.out.println("Enter c = ");
    // int c = scanner.nextInt();
    // int max;
    // int maximun = Math.max(a, Math.max(b, c));
    // System.err.println("maximun : " + maximun);
    // if (a > b) {
    // max = a;
    // } else {
    // max = b;
    // }
    // if (c > max) {
    // max = c;
    // }
    // System.err.println("max : " + max);
    // scanner.close();
    // }
    class Persons {
        String name;
        int age;
        int number;

        public Persons(String name, int age, int number) {
            this.name = name;
            this.age = age;
            this.number = number;
        }

    }

    public void ClassTopper(Scanner scanner) {
        System.out.println("Enter total number of students : ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        Persons[] student = new Persons[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Marks: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            // Initialize the student object
            student[i] = new Persons(name, age, number);

        }

        Persons topperStudent = findTopper(student);
        System.out.println("Topper Student : " + topperStudent.name);
        scanner.close();
        // Scanner scanner = new Scanner(System.in);
        // Persons TopperStudent = findTopper(student) ;
    }

    public static Persons findTopper(final Persons[] students) {

        Persons topper = students[0]; // Assume the first student is the topper

        for (int i = 1; i < students.length; i++) { // Start from the second student
            if (students[i].number > topper.number) {
                topper = students[i]; // Update topper if the current student has higher marks
            }
        }

        return topper;
    }
}