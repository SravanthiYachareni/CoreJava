import java.io.*;
public class Palindrome
{
public static void main(String arr[])
{
int s=0,n=454,temp,a;
temp=n;
while(n>0)
{
a=n%10;
s=(s*10)+a;
n=n/10;
}
if(s==temp)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}