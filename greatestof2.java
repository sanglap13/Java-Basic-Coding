import java.util.Scanner;

public class greatestof2 {

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st no.: ");
    int num1= sc.nextInt();
    System.out.print("Enter 2nd no.: ");
    int num2= sc.nextInt();

    //conditions
    if(num1 == num2)
    {
            System.out.println("Both are equal numbers");

    }
    else if(num1>num2)
    {
        System.out.println(num1 + " is greater than " + num2);
    }
    else
    {
        System.out.println(num2 + " is greater than " + num1);
    }
}
}

// Java (Method 1)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main(String[] args) {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input first number
//         System.out.print("Enter the first number : ");
//         int num1 = sc.nextInt();
//         //input second number
//         System.out.print("Enter the second number : ");
//         int num2 = sc.nextInt();
//         //conditions
//         if (num1 > num2)
//             System.out.println(num1 + " is greater than " + num2);
//         else if (num2 > num1)
//             System.out.println(num2 + " is greater than " + num1);
//         else
//             System.out.println("Both numbers are Equal");
//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
// Java (Method 2)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main(String[] args) {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the two numbers");
//         int first = sc.nextInt();
//         int second = sc.nextInt();

//         int largest = 0;

//         //conditions
//         if(num1 == num2)
//             System.out.println("Both numbers are equal");
//         else
//             largest = (num1 > num2) ? num1 : num2;


//         System.out.println(largest + " is the largest");

//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
// Java (Method 3)
// import java.util.Scanner;
// public class LearnCoding
// {
//     public static void main(String[] args) {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input first number
//         System.out.print("Enter the first number : ");
//         int first = sc.nextInt();
//         //input second number
//         System.out.print("Enter the second number : ");
//         int second = sc.nextInt();

//         int largest = 0;

//         //conditions
//         if(first == second)
//             System.out.println("Both numbers are equal");
//         else
//             System.out.println(Math.max(first, second));

//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
