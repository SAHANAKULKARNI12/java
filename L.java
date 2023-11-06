import java.util.Scanner;
public class K{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("enetr a 3-digit number:");
int num=s.nextInt();
if(num>=100&&num<=999){
int digit1=number/100;
int digit2=(number/10)%10;
int digit3=number%10;
System.out.println("digit:"+digit1);
System.out.println("digit:"+digit2);

System.out.println("digit:"+digit3);
}
else{
System.out.println("enter a 3-digit number");
}
}
}