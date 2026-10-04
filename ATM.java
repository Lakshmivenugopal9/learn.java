import java.util.Scanner;

class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;
        int attempts = 0;
        boolean login = false;

        // PIN verification
        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                login = true;
                System.out.println("Login successful!");
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN!");
                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }

        if (login == false) {
            System.out.println("Account blocked.");
        } else {

            int choice;

            do {

                System.out.println();
                System.out.println("========== ATM ==========");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.println("=========================");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.println("Current Balance: ₹" + balance);

                } else if (choice == 2) {

                    System.out.print("Enter deposit amount: ₹");
                    int deposit = sc.nextInt();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful.");
                        System.out.println("New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }

                } else if (choice == 3) {

                    System.out.print("Enter withdrawal amount: ₹");
                    int withdraw = sc.nextInt();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }

                } else if (choice == 4) {

                    System.out.println("Thank you for using the ATM.");

                } else {

                    System.out.println("Invalid choice.");

                }

            } while (choice != 4);
        }

        sc.close();
    }
}