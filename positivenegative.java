import java.util.Scanner;
public class positivenegative {
    
     public static void main(String[] args)
    {
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input from the user
        System.out.print("Enter a Number : ");
        int numb = sc.nextInt();

        if(numb >= 0){
            if(numb == 0)
                System.out.println("Zero");
            else
                System.out.println("Positive");
        }
        else
            System.out.println("Negative");
        //closing scanner class(not compulsory, but good practice)
        sc.close();
    }
}

// Java (Method 1)
// import java.util.Scanner;

// public class LearnCoding {
//     public static void main(String[] args)
//     {
//         //scanner class declaration
//         Scanner sc = new Scanner(System.in);
//         //input from the user
//         System.out.print("Enter a Number : ");
//         int numb = sc.nextInt();

//         if(numb >= 0){
//             if(numb == 0)
//                 System.out.println("Zero");
//             else
//                 System.out.println("Positive");
//         }
//         else
//             System.out.println("Negative");
//         //closing scanner class(not compulsory, but good practice)
//         sc.close();
//     }
// }
// Java (Method 2)
// import java.util.Scanner;

// public class LearnCoding {
//     public static void main(String[] args) {

//         Scanner reader = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int numb = reader.nextInt();

//         if(numb == 0){
//             System.out.println("Zero");
//         }
//         else {
//             String result = (numb > 0) ? "Positive" : "Negative";

//             System.out.println(result);
//         }
//     }
// }


