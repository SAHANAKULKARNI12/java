import java.util.Scanner;
public class leap{

public static void main(String[]args){
Scanner s=new Scanner(System.in);
int year =s.nextInt();
boolean isLeapYear=false;
if(year%4==0){
if(year%100==0){
if(year%400==0){
   isLeapYear=true;
}
}
else{
isLeapYear=true;
}
}
if(isLeapYear){
System.out.println(year+"is a leap year:");
}
else{
System.out.println(year+"is not a leap year:");
}
}
}

