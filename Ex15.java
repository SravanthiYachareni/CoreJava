//Example on switch statement
import java .util.Scanner;
public class Ex15  {
	public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number b/w  to 3");
	int n;
	n=input.nextInt();
	switch(n)
	{
	case 1:System.out.println("One");
	break;
	case 2:System.out.println("Two");
	break;
	case 3:System.out.println("Three");
	break;
	default:System.out.println("Invalid input");
	}
	}

}