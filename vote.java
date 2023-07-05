//if else
import java.util.Scanner;

public class vote {

    public static void main(String[] args)
    {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from the user
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println("Vote");
        else
            System.out.println("Can not Vote");
        //closing scanner class(not compulsory, but good practice)
        sc.close();
}
}


// Java (Method 2 Wont Work)
// package LinkedLists;

// import java.util.Scanner;

// public class LearnCoding {
//     public static void main(String[] args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input from the user
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();

//         // why this is wrong ? Return type should be int || but we are not returning anything thus void
//         int temp = age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote");
//         // unlike C++ / C we can't simply use ternary as
//         //  age >=18 ? System.out.println("Vote") : System.out.println("Can not Vote");
//     }
// }
 
// Java Method 2 (will Work)
// package LinkedLists;
// import java.util.Scanner;
// public class LearnCoding {
//     public static void main(String[] args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input from the user
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();

//         String result = age >=18 ? "Vote" : "Can not Vote";

//         System.out.println(result);

//     }
// }