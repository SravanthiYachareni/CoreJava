import java.util.Scanner;
public class Ex13 {
public static void main(String[]args) {
Scanner input =new Scanner(System.in);
int n,hr,min,sec;
System.out.println("enter Positive value");
n=input.nextInt();
hr=n/3600;
n=n%3600;
min=n/60;
sec=n%60;
System.out.println("Hr"+hr);
System.out.println("min"+min);
System.out.println("sec"+sec);
}
}

