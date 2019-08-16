
// Example on string comparision
import java .util.Scanner;
public class Ex16 {
public static void main(String[]args) {
Scanner input=new Scanner(System.in);
 System.out.println("Enter password");
 String pw=input.next();
 switch(pw)
 {
 case "admin":System.out.println("Check ok");
 break;
 default:System.out.println("Invalid password");
 }
 }
 }