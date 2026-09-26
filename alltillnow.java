/*
 * ==============================
 *        JAVA LEARNINGS
 * ==============================
 *
 * This file contains the Java concepts
 * learned so far.
 *
 * Use this file for revision.
 */

class alltillnow {

    public static void main(String[] args) {

        // ==========================================
        // 1. PRINTING
        // ==========================================

        System.out.println("Hello World");

        // Print text
        System.out.println("My name is Lakshh");

        // Print a number
        System.out.println(20);

        // Combine text + number
        System.out.println("My age is " + 20);


        // ==========================================
        // 2. VARIABLES
        // ==========================================

        // int = whole numbers
        int age = 20;

        System.out.println("Age: " + age);

        // Changing the value of a variable
        age = 21;

        System.out.println("New age: " + age);


        // ==========================================
        // 3. BASIC ARITHMETIC
        // ==========================================

        int a = 20;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));


        // ==========================================
        // 4. MULTIPLE VARIABLES
        // ==========================================

        int math = 98;
        int java = 94;
        int DS = 98;

        int total = math + java + DS;

        System.out.println("Total: " + total);


        // ==========================================
        // 5. AVERAGE
        // ==========================================

        int marks = 586;

        // Integer division:
        // 586 / 6 gives 97, not 97.666...
        int average = marks / 6;

        System.out.println("Average: " + average);


        // ==========================================
        // 6. IF - ELSE
        // ==========================================

        int mark = 75;

        if (mark >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


        // ==========================================
        // 7. COMPARISON OPERATORS
        // ==========================================

        /*
         * >   greater than
         * <   less than
         * >=  greater than or equal to
         * <=  less than or equal to
         * ==  equal to
         * !=  not equal to
         */

        int number = 50;

        if (number >= 40) {
            System.out.println("Number is 40 or above");
        }


        // ==========================================
        // 8. AND OPERATOR &&
        // ==========================================

        int totalMarks = 586;
        int avg = 97;

        // BOTH conditions must be true
        if (totalMarks >= 240 && avg >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }


        // ==========================================
        // 9. ELSE IF
        // ==========================================

        int gradeMark = 97;

        if (gradeMark >= 90) {
            System.out.println("Grade: A");
        }
        else if (gradeMark >= 75) {
            System.out.println("Grade: B");
        }
        else if (gradeMark >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }


        // ==========================================
        // 10. STRING VARIABLES
        // ==========================================

        String name = "Lakshh";
        String college = "CIT";
        String department = "CSE";

        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Department: " + department);


        // ==========================================
        // 11. DOUBLE
        // ==========================================

        /*
         * double can store decimal numbers.
         */

        double price = 25.50;

        System.out.println("Price: " + price);


        // ==========================================
        // 12. FLOAT
        // ==========================================

        /*
         * float also stores decimal numbers.
         * 'f' is required after a float literal.
         */

        float value = 25.5f;

        System.out.println("Float value: " + value);


        // ==========================================
        // 13. Math.pow()
        // ==========================================

        /*
         * Math.pow(number, power)
         *
         * Example:
         * 4³ = 4 × 4 × 4 = 64
         *
         * Math.pow() returns a double.
         */

        double num = 4;

        double cube = Math.pow(num, 3);

        System.out.println("Cube: " + cube);


        // ==========================================
        // 14. CUBE WITHOUT Math.pow()
        // ==========================================

        int n = 4;

        int cubeNumber = n * n * n;

        System.out.println("Cube: " + cubeNumber);


        // ==========================================
        // 15. TYPE CASTING
        // ==========================================

        /*
         * Converting one data type into another.
         *
         * double -> int
         */

        double decimalNumber = 64.9;

        int wholeNumber = (int) decimalNumber;

        System.out.println("After casting: " + wholeNumber);


        // ==========================================
        // 16. COMPLETE STUDENT REPORT LOGIC
        // ==========================================

        String studentName = "Lakshh";

        int mathematics = 98;
        int javaMarks = 94;
        int dataStructures = 98;
        int operatingSystems = 96;
        int computerProgramming = 100;
        int git = 100;

        int studentTotal =
                mathematics + javaMarks + dataStructures
                + operatingSystems + computerProgramming + git;

        int studentAverage = studentTotal / 6;

        int marksNeeded = 600 - studentTotal;

        System.out.println("---------------- STUDENT REPORT ----------------");

        System.out.println("Name: " + studentName);
        System.out.println("Total: " + studentTotal);
        System.out.println("Average: " + studentAverage);
        System.out.println("Marks needed: " + marksNeeded);


        // PASS / FAIL
        if (studentTotal >= 240 && studentAverage >= 40) {
            System.out.println("Status: PASS");
        }
        else {
            System.out.println("Status: FAIL");
        }


        // GRADE
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


        // ==========================================
        // END OF JAVA LEARNINGS
        // ==========================================

        System.out.println("-----------------------------------------------");
        System.out.println("Keep Learning Java!");
    }
}