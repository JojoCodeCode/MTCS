package week03;

public class week03SourceControlArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstName  = "Bob";
String lastName = "Ross";
String fullName = createFullName(firstName,lastName);
String fullName2 = createFullName("Sam", lastName);
System.out.println(fullName);
System.out.println(fullName2);
	}
public static String createFullName(String x, String y) {
	String fullName = x + " " + y;
	return fullName;
}
}
