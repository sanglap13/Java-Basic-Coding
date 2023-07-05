import java.util.Scanner;

public class oddeven {
     public static void main(String[] args)
    {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from the user        
        System.out.print("Enter a Number : ");
        int numb = sc.nextInt();
        
        //condition for even
        if(numb  %  2 == 0)
            System.out.println(numb + " is Even Number");
            //condition for odd
        else
            System.out.println(numb + "is Odd Number");
        
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}

// Java (Method 2)
// import java.util.Scanner;
// public class LearnCoding {
//     public static void main(String[] args) {

//         Scanner reader = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = reader.nextInt();

//         String evenOdd = (num % 2 == 0) ? "even" : "odd";

//         System.out.println(num + " is " + evenOdd);

//     }
// }
// Java (Method 3 - using Bitwise Ops)
// import java.util.Scanner;
// public class LearnCoding {
//     public static boolean isEven(int num)
//     {
//         if((num & 1) == 0)
//             return true;
//         else
//             return false;
//     }
//     public static void main(String[] args) {

//         Scanner reader = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = reader.nextInt();

//         if(isEven(num) == true)
//             System.out.print("Even");
//         else
//             System.out.print("Odd");

//     }
// }

