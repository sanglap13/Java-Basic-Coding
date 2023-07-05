import java.util.Scanner;
public class grade {
    public static void main(String[] args)
    {
        int marks;
        System.out.println("Enter your marks ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks<0 || marks>100)
        {
            System.out.println("Invalid");
        }
        else if(marks<50)
        {
            System.out.println("Grade F");
        }
        else if(marks>=50 && marks<60)
        {
            System.out.println("Grade D");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("Grade C");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("Grade B");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("Grade A");
        }
        else
        {
            System.out.println("Grade A+");
        }
    }
}

