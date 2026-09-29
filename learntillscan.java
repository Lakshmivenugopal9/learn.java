/*
 * ============================================================
 *                    JAVA LEARNINGS
 * ============================================================
 *
 * Everything learned so far:
 *
 * 1.  Basic Java structure
 * 2.  main() method
 * 3.  System.out.println()
 * 4.  Variables
 * 5.  String
 * 6.  int
 * 7.  Changing variable values
 * 8.  Arithmetic operators
 * 9.  Comparison operators
 * 10. if / else
 * 11. else if
 * 12. && (AND)
 * 13. double
 * 14. float
 * 15. Math.pow()
 * 16. Type casting
 * 17. Scanner
 * 18. User input
 * 19. Student Report
 *
 * This file is mainly for revision.
 */

import java.util.Scanner;


class Java_Learnings {

    public static void main(String[] args) {


        // ====================================================
        // 1. PRINTING
        // ====================================================

        System.out.println("Hello World");

        System.out.println("My name is Lakshh");

        System.out.println("My age is " + 20);


        // ====================================================
        // 2. VARIABLES
        // ====================================================

        int age = 29;

        System.out.println("Age: " + age);

        // Changing the value of a variable

        age = 30;

        System.out.println("New age: " + age);


        // ====================================================
        // 3. STRING
        // ====================================================

        String name = "Lakshh";

        System.out.println("Name: " + name);


        // ====================================================
        // 4. BASIC ARITHMETIC
        // ====================================================

        int a = 15;
        int b = 25;

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = b / a;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);


        // ====================================================
        // 5. CHANGING A VARIABLE
        // ====================================================

        b = 30;

        sum = a + b;

        System.out.println("New sum: " + sum);


        // ====================================================
        // 6. COMPARISON OPERATORS
        // ====================================================

        /*
         * >    Greater than
         * <    Less than
         * >=   Greater than or equal to
         * <=   Less than or equal to
         * ==   Equal to
         * !=   Not equal to
         */


        // ====================================================
        // 7. IF / ELSE
        // ====================================================

        int marks = 75;

        if (marks >= 40) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


        // ====================================================
        // 8. AND OPERATOR &&
        // ====================================================

        int total = 586;
        int average = 97;

        /*
         * && means AND.
         *
         * Both conditions must be true.
         */

        if (total >= 240 && average >= 40) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


        // ====================================================
        // 9. ELSE IF
        // ====================================================

        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else if (average >= 75) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }


        // ====================================================
        // 10. INTEGER DIVISION
        // ====================================================

        int totalMarks = 586;

        /*
         * Since both numbers are int,
         * the result is also treated as an integer.
         *
         * 586 / 6 = 97
         *
         * The decimal part is removed.
         */

        int avg = totalMarks / 6;

        System.out.println("Average: " + avg);


        // ====================================================
        // 11. DOUBLE
        // ====================================================

        /*
         * double stores decimal numbers.
         */

        double price = 25.5;

        System.out.println("Price: " + price);


        // ====================================================
        // 12. FLOAT
        // ====================================================

        /*
         * float also stores decimal numbers.
         *
         * 'f' is required for a float value.
         */

        float value = 25.5f;

        System.out.println("Float: " + value);


        // ====================================================
        // 13. Math.pow()
        // ====================================================

        /*
         * Math.pow(number, power)
         *
         * Example:
         *
         * 4^3 = 4 × 4 × 4 = 64
         *
         * Math.pow() returns double.
         *
         * No import is required for Math.pow().
         */

        double num = 4;

        double cube = Math.pow(num, 3);

        System.out.println("Cube: " + cube);


        // ====================================================
        // 14. CUBE WITHOUT Math.pow()
        // ====================================================

        int number = 4;

        int cubeNumber = number * number * number;

        System.out.println("Cube: " + cubeNumber);


        // ====================================================
        // 15. TYPE CASTING
        // ====================================================

        /*
         * Type casting means converting one data type
         * into another.
         *
         * double -> int
         */

        double decimalNumber = 64.9;

        int wholeNumber = (int) decimalNumber;

        System.out.println("Whole number: " + wholeNumber);

        // Output: 64


        // ====================================================
        // 16. SCANNER
        // ====================================================

        /*
         * Scanner is used to take input from the user.
         *
         * Scanner belongs to java.util.
         *
         * Therefore we need:
         *
         * import java.util.Scanner;
         *
         * at the top of the program.
         */

        Scanner input = new Scanner(System.in);


        // ====================================================
        // 17. SCANNER - STRING INPUT
        // ====================================================

        System.out.print("Enter your name: ");

        String userName = input.nextLine();

        System.out.println("Hello " + userName);


        // ====================================================
        // 18. SCANNER - INTEGER INPUT
        // ====================================================

        System.out.print("Enter your age: ");

        int userAge = input.nextInt();

        System.out.println("Your age is: " + userAge);


        // ====================================================
        // 19. SCANNER - DOUBLE INPUT
        // ====================================================

        System.out.print("Enter your percentage: ");

        double percentage = input.nextDouble();

        System.out.println("Percentage: " + percentage);


        // ====================================================
        // 20. SCANNER + IF / ELSE
        // ====================================================

        System.out.print("Enter your marks: ");

        int userMarks = input.nextInt();

        if (userMarks >= 40) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }


        // ====================================================
        // 21. SCANNER + ELSE IF
        // ====================================================

        System.out.print("Enter your average: ");

        int userAverage = input.nextInt();

        if (userAverage >= 90) {
            System.out.println("Grade: A");
        }
        else if (userAverage >= 75) {
            System.out.println("Grade: B");
        }
        else if (userAverage >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }


        // ====================================================
        // 22. COMPLETE STUDENT REPORT
        // ====================================================

        String studentName;
        String college;
        String department;
        String status;

        int semester;
        int math;
        int java;
        int DS;
        int OS;
        int CP;
        int Git;


        System.out.println();
        System.out.println("=================================================");
        System.out.println("============= STUDENT ACADEMIC REPORT ===========");
        System.out.println("=================================================");


        // Student details

        System.out.print("Enter name: ");
        studentName = input.next();

        System.out.print("Enter college: ");
        college = input.next();

        System.out.print("Enter semester: ");
        semester = input.nextInt();

        System.out.print("Enter department: ");
        department = input.next();


        // Marks

        System.out.print("Enter Mathematics marks: ");
        math = input.nextInt();

        System.out.print("Enter Java marks: ");
        java = input.nextInt();

        System.out.print("Enter DS marks: ");
        DS = input.nextInt();

        System.out.print("Enter OS marks: ");
        OS = input.nextInt();

        System.out.print("Enter CP marks: ");
        CP = input.nextInt();

        System.out.print("Enter Git marks: ");
        Git = input.nextInt();


        // Calculations

        int studentTotal = math + java + DS + OS + CP + Git;

        int studentAverage = studentTotal / 6;

        int needed = 600 - studentTotal;


        // PASS / FAIL

        if (studentTotal >= 240 && studentAverage >= 40) {
            status = "PASS";
        }
        else {
            status = "FAIL";
        }


        // Display details

        System.out.println();
        System.out.println("Name: " + studentName);
        System.out.println("College: " + college);
        System.out.println("Semester: " + semester);
        System.out.println("Department: " + department);

        System.out.println("---------------- SUBJECT MARKS ----------------");

        System.out.println("Mathematics: " + math);
        System.out.println("Java: " + java);
        System.out.println("DS: " + DS);
        System.out.println("OS: " + OS);
        System.out.println("CP: " + CP);
        System.out.println("Git: " + Git);

        System.out.println("---------------- CALCULATIONS ----------------");

        System.out.println("Total marks: " + studentTotal);
        System.out.println("Average marks: " + studentAverage);
        System.out.println("Marks needed: " + needed);

        System.out.println("Status: " + status);


        // ====================================================
        // 23. GRADE
        // ====================================================

        if (studentAverage >= 90) {
            System.out.println("Grade: A");
        }
        else if (studentAverage >= 75) {
            System.out.println("Grade: B");
        }
        else if (studentAverage >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }


        // ====================================================
        // 24. CLOSE SCANNER
        // ====================================================

        input.close();


        // ====================================================
        // END
        // ====================================================

        System.out.println("-----------------------------------------------");
        System.out.println("Keep Learning Java!");
    }
}