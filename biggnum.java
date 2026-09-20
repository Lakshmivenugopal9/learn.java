import java.util.Scanner;

public class biggnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        if(a>b) {
            System.out.println("First number is bigger");
        }
        else {
            System.out.println("Second numberis bigger");
        }
    }
}