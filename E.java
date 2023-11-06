import java.util.Scanner;
public class E{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter num:");
int num=s.nextInt();



if(num %3 ==0)
{
 System.out.println("Hello");
}
else if(num%5==0)
{
System.out.println("Hi");
}
else if(num%3==0 && num%5==0)
{
 System.out.println("Hello");
}
else
{
System.out.println("invalid");
}
}
}