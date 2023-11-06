class person{
int id;
String name;

public person()
{
id=5;
name="NOBITA";
}
}

public class student
{
public static void main(String args[])
{

person s1 = new person();
System.out.println(s1.id);
System.out.println(s1.name);
}
}