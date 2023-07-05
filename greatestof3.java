import java.util.Scanner;

public class greatestof3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st no.: ");
    int num1= sc.nextInt();
    System.out.print("Enter 2nd no.: ");
    int num2= sc.nextInt();
    System.out.print("Enter 3rd no.: ");
    int num3= sc.nextInt();

    //conditions

    if(num1 == num2 && num1 == num3)
    {
        System.out.println("All are equal numbers");
    }
    else if(num1 > num2 && num1 > num3)
    {
        System.out.println(num1 + " is greater than " + num2 + " and " + num3);
    }
    else if(num2 > num1 && num2 > num3)
    {
        System.out.println(num2 + " is greater than " + num1 + " and " + num3);
    }
    else 
    {
        System.out.println(num3 + " is greater than " + num2 + " and " + num1);
    }


    }
}

// Java (Method 1)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main (String[]args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner (System.in);
//         //input three numbers from user
//         System.out.print ("Enter the first number : ");
//         int first = sc.nextInt ();
//         System.out.print ("Enter the second number : ");
//         int second = sc.nextInt ();
//         System.out.print ("Enter the third number : ");
//         int third = sc.nextInt ();
//         System.out.println ();
        
//         //condition for first number
//         if (first > second && first > third)
//             System.out.println (first + " is the greatest number.");
//             //condition for second number
//         else if (second > first && second > third)
//             System.out.println (second + " is the greatest number.");
//             //condition for third number            
//         else
//             System.out.println (third + " is the greatest number.");

//         //closing scanner class(not compulsory, but good practice)
//         sc.close ();
//     }
// }
// Java (Method 2)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main (String[]args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner (System.in);
//         //input three numbers from user
//         System.out.print ("Enter the first number : ");
//         int first = sc.nextInt ();
//         System.out.print ("Enter the second number : ");
//         int second = sc.nextInt ();
//         System.out.print ("Enter the third number : ");
//         int third = sc.nextInt ();
//         System.out.println ();
//         int temp, result;

//         // find the largest bw first and second and store in temp
//         temp = first > second ? first:second;
//         // find the largest bw temp and third and finally printing it
//         result = temp > third ? temp:third;
        
//         // the above two ternary statements can be condensed into one ternary statement
//         //result = third > (first > second ? first : second) ? third : ((first > second) ? first : second);  


//         System.out.println(result + " is the largest");

//         //closing scanner class(not compulsory, but good practice)
//         sc.close ();
//     }
// }
// Java (Method 3)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main (String[]args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner (System.in);
//         //input three numbers from user
//         System.out.print ("Enter the first number : ");
//         int first = sc.nextInt ();
//         System.out.print ("Enter the second number : ");
//         int second = sc.nextInt ();
//         System.out.print ("Enter the third number : ");
//         int third = sc.nextInt ();
//         System.out.println ();
//         int temp, result;

//         result = Math.max(first, Math.max(second, third));


//         System.out.println(result + " is the largest");

//         //closing scanner class(not compulsory, but good practice)
//         sc.close ();
//     }
// }