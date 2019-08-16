import java.util.Scanner;

public class Swap {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values");
		int a = input.nextInt();
		int b = input.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap a = "+a+", b ="+b);
	}
}
