// Problem Statement
// Write a program to print all numbers between two intervals, namely low and high.
// But, with a special condition that if any number in the range while getting printed
// becomes divisible by 13 then you must not print anything further and stop. 
// (Do this using the Break Statement)

// Example -

// Input -
// 1 10

// Output 
// 1 2 3 4 5 6 7 8 9 10

 
// Input
// 10 20

// Output
// 10 11 12 13


// Input
// -18 0

// Output
// -18 -17 -16 -15 -14 -13

//for loop
import java.util.Scanner;
public class break_ {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        for(int i = low;i<=high;i++)
        {
            System.out.print(i + " ");
        
            if(i%13==0)
                break;
        }
    }
}

// Java (While Loop)
// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.Scanner;

// class LearnCoding {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the numbers: ");
//         int low = sc.nextInt();
//         int high = sc.nextInt();
        
//         int i = low;
//         while(i<=high)
//         {
//             System.out.print(i + " ");
        
//             if(i%13==0)
//                 break;
//             i++;
//         }
//     }
// }