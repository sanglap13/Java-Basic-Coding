//for
import java.util.Scanner;

public class natural {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            System.out.print(i+" ");
        }
    }
}

// //while
// import java.util.Scanner;
// public class LearnCoding {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         int i = 1;

//         while(i<=num){
//             System.out.print(i + " ");
//             i++;
//         }
//     }
// }

// //do while
// import java.util.Scanner;
// public class LearnCoding {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();

//         int i = 1;

//         do{
//             System.out.print(i + " ");
//             i++;
//         }while (i<=num);
//     }
// }