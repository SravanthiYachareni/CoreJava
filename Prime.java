public class Prime
{
public static void main(String arr[])
{
int n=6,i,count=0;
for(i=1;i<=6;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Prime number");
}
else 
{
System.out.println("Not a prime");
}
}
}