// Problem Statement
// Write a program to create an interface of an MCQ, ask the user for
// the option of his choice as an integer and print the option that he has
// selected. Options are marked from 1 to 4 any other integer input should be printed 
// as invalid

// Input :
// 2

// Output
// Option 2 Selected

 
// Input
// 5

// Output
// Invalid

import java.util.Scanner;

public class switch_ {
    public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.print ("Enter your choice: ");
    int option = sc.nextInt ();

    switch (option)
      {
      case 1:
	System.out.println ("Option 1 Selected");
	break;
	case 2:System.out.println ("Option 2 Selected");
	break;
	case 3:System.out.println ("Option 3 Selected");
	break;
	case 4:System.out.println ("Option 4 Selected");
	break;
	default:System.out.println ("Invalid");
	break;
      }
  }
}
