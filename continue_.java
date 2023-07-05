// Problem Statement
// Write a program to print all numbers between two intervals, namely low and high.
// But, with a special condition that numbers divisible by 5 must not be printed and skipped.
// (Do this using continue Statement)

// Sample Input
// 1 10

// Sample Output
// 1 2 3 4 6 7 8 9

 
// Sample Input
// 10 20

// Sample Output
// 11 12 13 14 16 17 18 19

import java.util.Scanner;

public class continue_ {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        
        for(int i = low;i<=high;i++)
        {
            if(i%5==0)
                continue;
        
            System.out.print(i + " ");
        }
    }
}
