import java.util.Scanner;

class add{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, sum, sub, multi, div, reminder, sq1, sq2; 
        double cube1, cube2;

        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        System.out.print("Enter second number:");
        num2 = sc.nextInt();

        sum = num1+num2;
        System.out.println("sum is: "+sum);

        sub = num1-num2;
        System.out.println("sub is: "+sub);

        multi = num1*num2;
        System.out.println("Product is: "+multi);

        if (num2!=0) {
            div = num1/num2;
            reminder = num1%num2;
            System.out.println("Quotient is: "+div);
            System.out.println("Reminder is: "+reminder);
        } else {
             System.out.println("Please enter a non zero divider.");
        }
        
        sq1 = num1*num1;
        sq2 = num2*num2;
        System.out.println("Square of 1st no. is: "+sq1+"\nSquare of 2nd no. is: "+sq2);
        cube1 = Math.pow(num1,3);
        cube2 = Math.pow(num2,3);
        System.out.println("Cube of 1st no. is: "+cube1+"\nCube of 2nd no. is: "+cube2);

        sc.close();
    }
}