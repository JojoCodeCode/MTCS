package com.promineotech;

public class Application {

	public static void main(String[] args) {System.out.println("My first Java Program!");
		// TODO Auto-generated method stub
//this is a comment
int samsage = 31;
double accountBalance = 34.67;
char middleInitial = 'm';
boolean isHotOutside = true;
String firstName = "sam";
System.out.println(samsage);
System.out.println(accountBalance);
System.out.println(middleInitial);
System.out.println(isHotOutside);
System.out.println(firstName);
int age = 34;
System.out.println(age);
boolean isAge30 = age == 30;
System.out.println(isAge30);

System.out.println(age == 34);

age = age +1;
System.out.println(age);

String firstname = "tommy";
String lastname = "smith";
String fullName = firstname + " " + lastname;
System.out.println(fullName);
System.out.println(accountBalance);
double currentBalance=29.00;
System.out.print("The balance in your account is:" + String.format("$%.2f", currentBalance));
	}

}