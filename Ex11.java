import java.util.Scanner;
public class Ex11 {
	public static void main(String[]args)
	{
	Scanner input=new Scanner(System.in);
	double p,r,ci;
	int t;
	System.out.println("Enter p,r,t values");
	p=input.nextDouble();
	r=input.nextDouble();
	t=input.nextInt();
	ci=p*Math.pow(1+100,t);
	ci=ci-p;
	System.out.printf("CI Amt:%2f\n",ci);
	}
	}