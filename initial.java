import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number >> ");
        // int myroll = input.nextInt();
        // System.out.println("number is = " + myroll);
        

        // ? Program OF Sum

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter two number, separated in space");
        // int num1= input.nextInt();
        // int num2 = input.nextInt();
        // int sum= num1 +num2;
        // System.out.println("sum is > "+sum);

        // int nume = (int)(nume);
        // System.out.println(nume);

        // ? Assignment > 1
        // Write Java programs for the following:
        

	    // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
	    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
	    // Input currency in rupees and output in USD.
                   
        // ? -----------------------------------------------
        // Write a program to print whether a number is even or odd, also take input.
        
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter A number to check odd or EVen > ");
        // int number = input.nextInt();

        // if (number % 2 == 0 ) {
        //     System.out.println("Even\n");
        // } else {
        //     System.out.println("Odd\n");
        // }

	    
        // // ? -----------------------------------------------
        // // Take name as input and print a greeting message for that name.

        // Scanner input1 = new Scanner(System.in);
        // System.out.println("Enter Your  Good Name");
        // String name = input1.nextLine();
        // System.out.println("Hello " + name + ", Welcome To Java Classes\n");

        // // ? -----------------------------------------------
        // // Take 2 numbers as input and print the largest number.

        // Scanner inputs = new Scanner(System.in);
        // System.out.println("Enter Two Numbers> ");
        // int num1 = inputs.nextInt();
        // int num2 = inputs.nextInt();
        
        // if( num1 > num2) {
        //     System.out.println(num1+ " is Greater");
        // } else {
        //     System.out.println(num2+ " is Greater");
        // }

        // ?----------------------------------------------------
        
        // Scanner numbs = new Scanner(System.in);    

        // int a= numbs.nextInt();
        // int b = numbs.nextInt();
        // int c = numbs.nextInt();

        // Find The largest of 3 numbers

        // int max = a;
        // if(b > max) {
        //     max = b;   
        // }
        // if(c > max) { 
        //     max=c;    
        // }
        // System.out.println(max);
        
        // ? Alternate ( Use of functions)
        // int max1 = Math.max(a, b);
        // max1= Math.max(c, max1);
        // System.out.println(max1);

        // ? Alternate Way
        // int max1 = Math.max(c, Math.max(a, b));
        // System.out.println(max1);

        // Scanner inputt = new Scanner(System.in);
        // char ch = inputt.next().trim().charAt(0);
        // System.out.println(ch);

        // ? Fibonacci Numbers ( adding two previous number 0,1,1,2,3,5,...)

        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();  // nth Fibonacci Number
        // int previous= 0;
        // int current = 1;
        // int count = 2;

        // while ( count <= n ) {
        //     int temp = current;
        //     current += previous;
        //     previous = temp;
        //     count++;
        // }
        // System.out.println(current);

        // ? Counting repitition of same number like 454845 , 4 is 3 times

        // int n = 44784;    // Number where ill find 4 repetition
        // int count = 0;

        // while( n > 0) {
        //     int remainder = n % 10;
        //     if( remainder == 4) {
        //         count++;
        //     }
        //     n=n/10;
        // }
        // System.out.println("The Repetition of 4 is "+count+ " times");

        // ? Reverse the Number;

        // int n = 1245;
        // int ans = 0;

        // while( n > 0) {
        //     int rem = n %10;
        //     n /= 10;
        //     ans = ans * 10 +rem;
        // }
        // System.out.println(ans);

        // ? Calculator Program
        // TODO : This Code not working in this Editor.


        // Scanner in = new Scanner(System.in);
        // // Take input from user till user does not press X or x
        // int ans = 0;
        // while (true) {
        //     // take the operator as input
        //     System.out.print("Enter the operator: ");
        //     char op = in.next().trim().charAt(0);

        //     if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
        //         // input two numbers
        //         System.out.print("Enter two numbers: ");
        //         int num1 = in.nextInt();
        //         int num2 = in.nextInt();

        //         if (op == '+') {
        //             ans = num1 + num2;
        //         }
        //         if (op == '-') {
        //             ans = num1 - num2;
        //         }
        //         if (op == '*') {
        //             ans = num1 * num2;
        //         }
        //         if (op == '/') {
        //             if (num2 != 0) {
        //                 ans = num1 / num2;
        //             }
        //         }
        //         if (op == '%') {
        //             ans = num1 % num2;
        //         }
        //     } else if (op == 'x' || op == 'X') {
        //         break;
        //     } else {
        //         System.out.println("Invalid operation!!");
        //     }
        //     System.out.println(ans);
        // }

        
        

        // ? New From Here
            // Swicth Statements
            // ? This is Old Style Swicth Statements


            // Scanner in = new Scanner(System.in);
            // String fruit = in.next();

            // switch(fruit) {
            //     case "Mango":
            //         System.out.println("King of Fruits");
            //         break;

            //     case "Orange":
            //         System.out.println("Welcome To Nagpur :) ");
            //         break;

            //     default:
            //         System.out.println("None Fruits has been selected or not avail in our DB");
            //         // no break is required here.

            // } // End of Swicth Statement


            // // ? New Switch Statement

            // switch(fruit) {
            //     case "Mango"  ->  System.out.println("King of Fruits ");
            //     case "Orange" ->  System.out.println("Welcome To Nagpur :)");
            //     default ->  System.out.println("No Fruits has been selected");
            // } // End Of New Switch Statement

            




    }
}
