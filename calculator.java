package core_java;

import java.util.Scanner;

public class calculator {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for 'add' 2 for 'subtract' 3 for 'multiply' 4 for 'divide'");
        long a,b,c;
        c= sc.nextInt();
        System.out.println("Enter two numbers");
        if(c==1){
            a= sc.nextInt();
            b= sc.nextInt();
           // int add = a + b;
            System.out.println(a+b);
        }
        else if (c==2){
            a= sc.nextInt();
            b= sc.nextInt();
            //int subtract = a - b;
            System.out.println( a - b);
        }
        else if (c==3){
            a= sc.nextInt();
            b= sc.nextInt();
            //int multiply = a*b;
            System.out.println(a*b);
        }
        else if (c==4){
            a= sc.nextInt();
            b= sc.nextInt();
            /*int divide = a/b;
            int divide1 = a%b;*/
            System.out.println("Quotient: "+a/b);
            System.out.println("Remainder: "+a%b);
        }
        else
            System.out.println("Invalid Choice");
    }
}
//Conclusion : At the end we don't need predefined data type like int add || int subtract || int multiply || int divide.
//             We can directly put the calculations in the System.out.print and it will function properly without any
//             errors and it will also make the overall process small and effective.As we can see in the above code the
//             predefined data type is comment out.