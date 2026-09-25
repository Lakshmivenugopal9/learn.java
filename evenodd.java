import java.util.Scanner;

class evenodds {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the number : ");
        num=sc.nextInt();
        
        if (num%2==0)
            System.out.println("The number "+num+" is an even number.");
        else
            System.out.println("The number "+num+" is an odd number.");

        sc.close();
    }
}