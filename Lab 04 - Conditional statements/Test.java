// program to check if the given number is positive, zero or negative
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = in.nextInt();

        // Applying if conditionals
        // if (a < 0)
        //     System.out.println("The number is positive.");
        // Applying else conditionals
        // else 
        //     System.out.println ("The number is non-positive");
        // Applying else_if conditionals
        if (a > 0) {
            System.out.println("The number is positive.");
        } else if(a == 0) {
            System.out.println ("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}

/* Output:
Enter an integer:
-12
The number is negative.
*/