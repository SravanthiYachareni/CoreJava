import java.util.Scanner;
public class Ex18 {
public static void main(String[]args) {
Scanner in=new Scanner(System.in);
int i;
System.out.println( "Enter values ");
int n=in.nextInt();
myloop:
for( i=1;i<=n;i++)
{
if(i==3||i==7||i==10){
continue myloop;
System.out.println(i+ " ");
}
}
}
}