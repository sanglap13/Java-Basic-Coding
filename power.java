import java.util.Scanner;

public class power {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of base: ");
        double base = sc.nextDouble();
        System.out.print("Enter value of exponent: ");
        int exp = sc.nextInt();

        double res = 1;

        for(int i=1; i<=exp; i++)
        {
            res= res* base;
        }

        System.out.println("Ans: "+ res);

    }
}


// Java (Method 1)
// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.Scanner;

// class LearnCoding {
//     public static void main(String[] args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input base value and exponent value from user
//         System.out.print("Enter the value of base : ");
//         double base = sc.nextDouble();
        
//         System.out.print("Enter the value of exponent : ");
//         double exp = sc.nextDouble();
        
//         System.out.println("Answer = " + Math.pow(base,exp));
//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
// Java (Method 2 without using inbuilt functions)
// import java.util.Scanner;
// public class LearnCoding
// {
//         public static void main(String[] args) {
//  //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input base value and exponent value from user
//         System.out.print("Enter the value of base : ");
//         double base = sc.nextDouble();
//         System.out.print("Enter the value of exponent : ");
//         int exp = sc.nextInt();
//         //declare an integer variable to store the result
//         double result = 1;
//         //logic for calculating power of the entered number
//         while (exp != 0)
//         {
//             result = result * base;
//             --exp;
//         }

// //        for (int i = 1; i <= exp; i++)
// //          result = result * base;

// //        for (; exp!= 0; --exp)
// //            result = result * base;
//         //print the result
//         System.out.println("Answer = " + result);
//         //closing scanner class(not compulsory, but good practice)
//         sc.close();    
        
//     }
// }