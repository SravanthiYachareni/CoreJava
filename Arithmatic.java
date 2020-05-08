public class Arithmatic
{
static void add(int a,int b)
{
	int c=a+b;
System.out.println("Sum  is "+c);
}
static void add(int a,double b)
{
	double c=a-b;
System.out.println("Sub is"+c);
}
static void add(double a,int b)
{
double c=a*b;

System.out.println("mul is "+c);
}
public static void main(String arr[])
{
add(10,20);
add(10,10.0);
add(2.9,7.0);
}
}
