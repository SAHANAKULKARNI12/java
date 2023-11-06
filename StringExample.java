import java.lang.String;
public class StringExample{
public static void main(String[] args){
String greeting ="Hello";
String name="John";

String welcomeMessage=greeting+name;
System.out.println("welcomeMessage");

int length=welcomeMessage.length();
System.out.println("Length of the message:"+length);

char firstChar = welcomeMessage.charAt(0);
System.out.println("First character:"+firstChar);

String substring = welcomeMessage.substring(7);
System.out.println("String from index 7:"+substring);

int age=25;
String ageString=String.valueOf(age);
System.out.println("Age as String:"+ageString);

String anotherName="John";
if(name.equals(anotherName)){
System.out.println("The name are equal");
}
else{
System.out.println("The names are not equal");
}

String sentence ="Java programming is fun and java is versatile";
int indexOfJava= sentence.indexOf("Java");

String replacedSentence = sentence.replace("Java","Python");
System.out.println("After replacement:"+replacedSentence);

String upperCaseMessage= welcomeMessage.toUpperCase();
String lowerCaseMessage= welcomeMessage.toLowerCase();
System.out.println("UpperCase:"+upperCaseMessage);
System.out.println("LowerCase:"+lowerCaseMessage);
}

}


