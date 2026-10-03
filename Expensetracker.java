import java.util.Scanner;

class Expensetracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int budget;
        int total = 0;
        int largest = 0;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your daily budget: ");
        budget = sc.nextInt();

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter expense " + i + ": ");
            int expense = sc.nextInt();

            total = total + expense;

            if (expense > largest) {
                largest = expense;
            }
        }

        double average = total / 5.0;

        System.out.println();
        System.out.println("========== EXPENSE REPORT ==========");
        System.out.println("Name: " + name);
        System.out.println("Budget: " + budget);
        System.out.println("Total spent: " + total);
        System.out.println("Average expense: " + average);
        System.out.println("Largest expense: " + largest);

        if (total <= budget) {
            System.out.println("Budget Status: Within budget");
        } else {
            System.out.println("Budget Status: Over budget");
        }

        if (total >= 2000 && total <= 5000) {
            System.out.println("Spending Level: Moderate");
        } else if (total < 2000) {
            System.out.println("Spending Level: Low");
        } else {
            System.out.println("Spending Level: High");
        }

        if (total % 2 == 0) {
            System.out.println("Total spending is Even");
        } else {
            System.out.println("Total spending is Odd");
        }

        double square = Math.pow(total, 2);
        System.out.println("Square of total spending: " + square);

        System.out.println("==================================");

        sc.close();
    }
}