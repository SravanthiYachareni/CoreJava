import java. util.Scanner;
public class Ex9 {
	public static void main(String[]args) {
Scanner input = new Scanner(System.in);
double p,r,si;
int t;
System.out.println("Enter p,r,t values");
p=input.nextDouble();
r=input.nextDouble();
t=input.nextInt();
si=p*r*t/100;
System.out.printf("Si amount is %.2f\n",si);
}
}

