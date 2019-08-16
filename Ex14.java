//Write a program to find out grass salary and net salary of employee based on given input (name designation basic salary)
import java.util.Scanner;
public class Ex14 {
public static void main(String[]args) {
Scanner  Scan=new Scanner(System.in);
int id;
String name,job;
double bs ,hra,ta,ma,pf,pt,gs,ns;
System.out.println("Enter employee id,name,job&basic sal details");
id=Scan.nextInt();
name=Scan.nextLine();
Scan.next();
job=Scan.next();
bs=Scan.nextDouble();
hra=bs*40/100;
ta=bs*12/100;
ma=bs*0.1;
pf=bs*0.15;
pt=bs*0.08;
gs=bs+ta+hra+ma;
ns=gs-pf-pt;
System.out.printf("Grosssalary :%2f/n",gs);

System.out.printf("Netpay:%2f/n",ns);
}
}

