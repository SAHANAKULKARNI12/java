import java.util.Scanner;
public class main{
public static void main(String[]args)
{
int[]numbers={3,10,15};
for(int number:numbers){
if(number%3==0&&number%5==0){
System.out.println("hi");
}
else if(number%3==0){
System.out.println("hola");
}
else if(number%5==0){
System.out.println("hello");
}
}
}
}