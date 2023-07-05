import java.util.Scanner;
public class roundoff {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double num = sc.nextDouble();

        System.out.println("Round off value= " + Math.round(num));
        System.out.println("Floor value= " + Math.floor(num));
        System.out.println("Ceiling value= " + Math.ceil(num));

    }

}

