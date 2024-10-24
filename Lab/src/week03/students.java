package week03;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String studentName1 = "Tom Sawyer";
//String studentName2 = "Jack Smith";
//String studentName3 = "Bill Turner";
//System.out.println(studentName1);
//System.out.println(studentName2);
//System.out.println(studentName3);

//String[] students = new String[3];

//students[0] = "Tom Sayer";
//students[1] = "Jack Smith";
//students[2] = "Bill Turner";

//System.out.println(students[0]);
//System.out.println(students[1]);
//System.out.println(students[2]);

//for (int i=0; i< students.length; i++) {
//	System.out.println(students[i]);
//}
//System.out.println("Enhanced for loop:");
//for (String student : students) {
//	System.out.println(student);
//}

//String [] products = new String [5];
//products [0] = "carrots";
//products [1] = "cat";
//products [2] = "flowers";
//products [3] = "mug";
//products [4] = "computer";

//for (String product : products) {
//	System.out.println("Product: " + product);
	
//	int [] multiplesOf3 = new int[10];
	//for (int i= 1; i<= multiplesOf3.length; i++) {
//		multiplesOf3[i-1] = i*3;
//		System.out.println("number: " + multiplesOf3[i-1]);
//		}
//	}
//int[] multiplesOf5 = new int [10];
//for (int i=0; i<multiplesOf5.length; i++) {
//	multiplesOf5[i] = i*5;
//	System.out.println(multiplesOf5[i]);
//}
//}
	//
	// Arrays:
	//
	
	// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] randomNumbers = new int [6]; {
randomNumbers[0]= 1;
randomNumbers[1]= 5;
randomNumbers[2]= 2;
randomNumbers[3]= 8;
randomNumbers[4]= 13;
randomNumbers[5]= 6;
int[] array = {1,5,2,8,13,6}; 
	// 2. Print out the first element in the array
System.out.println(array[0]);
	
	// 3. Print out the last element in the array without using the number 5
System.out.println(array[array.length -1]);	
	
	// 4. Print out the element in the array at position 6, what happens?
//System.out.println(array[6]);
	
	// 5. Print out the element in the array at position -1, what happens?
//System.out.println(array[-1]);
		
	// 6. Write a traditional for loop that prints out each element in the array
for (int i=0 ; i< array.length; i++) {
	System.out.println(array[i]);
	
	// 7. Write an enhanced for loop that prints out each element in the array

	while (i<array.length) {
		System.out.println(array[i]);
		i++;
		
	}
	for (int number : array) {
		System.out.println(number);
	}
	// 8. Create a new variable called sum, write a loop that adds 
	//			each element in the array to the sum
double sum = 0;
while (i<array.length) {
	System.out.println(i+sum);
	
}
for (int number : array) {
	sum += number;
	System.out.println(sum);
}
		
	// 9. Create a new variable called average and assign the average value of the array to it
double average = (sum/array.length);
System.out.println(average);
	
	// 10. Write an enhanced for loop that prints out each number in the array 
	//			only if the number is odd
for (int number : array) {
	if (number%2!=0) {
		System.out.println(number);
	}
}
	
	// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String [] names = {"Sam", "Sally", "Thomas", "Robert"};
	
	// 12. Calculate the sum of all the letters in the new array
int sumOfLetters =0;
for (String name : names) {
	sumOfLetters += name.length();
	System.out.println(sumOfLetters);
}}}
	

	//
	// Methods:
	//
	
	// 13. Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	greeting("Tom");
	greeting("Marie");
	
	
	// 14. Write and test a method that takes a String name and  
	//			returns a greeting.  Do not print in the method.
System.out.println(greeting2("Kate"));

String heyHi = greeting2("Kate");
	System.out.println(heyHi);
	// Compare method 13 and method 14:  
	//		a. Analyze the difference between these two methods.
	//		b. What do you find? 
	//		c. How are they different?
	//
	
	// 15. Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	System.out.println(wordNumber("house", 8));
	
	// 16. Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	String [] wordz = {"fish", "dog", "Kate", "what"};
	System.out.println(stringWithinArray(wordz, "Kate"));
	
	// 17. Write and test a method that takes an array of int and 
	//			returns the smallest number in the array
	int [] smalls = {10, 15, 7, 3, 2};
System.out.println(smallestNumber(smalls));
	
	// 18. Write and test a method that takes an array of double and 
	//			returns the average
	double [] numz = {23.4, 12.4, 18, 75};
System.out.println(average(numz));
	// 19. Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position
int [] wordLengths= stringLength(wordz);
	for (int number : wordLengths) {
		System.out.println(number);
	}
	// 20. Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.
System.out.println(hasMoreEvenWordCharacters(wordz));

	// 21. Write and test a method that takes a string and 
	//			returns true if the string is a palindrome


	System.out.println(palindromeWord("raer"));
	

}


// Method 13:
public static void greeting(String greeting) {
	System.out.println("Hey, " + greeting + "!");
}

// Method 14:
public static String greeting2(String greet) {
	return "Hey, " + greet + "!";
}

// Method 15:
public static boolean wordNumber(String string, int number) {
	if (string.length()> number) {
		return true;
	}	
		return false;
}


// Method 16:
public static boolean stringWithinArray(String [] words, String word) {
	for (String str: words) {
		if (str.equals(word)) {
			return true;
		}}  
return false; 
}


// Method 17:
public static int smallestNumber(int [] smalls) {
	int smallest= smalls[0];

	for (int number: smalls) {
		if (number<smallest) {
			smallest = number;
		}
}return smallest;}


// Method 18:
public static double average(double [] numz) {
	double sumOfDoubles = 0;
for (double number : numz) {
	sumOfDoubles += number;
}
	return sumOfDoubles/numz.length;
	
	}
	
		
	


// Method 19:
public static int[] stringLength(String [] wordz) {
	int[] results = new int[wordz.length];
	for (int i=0; i< wordz.length; i++) {
		results [i] = wordz[i].length();
	} return results; 
}

// Method 20:
public static boolean hasMoreEvenWordCharacters(String [] wordz) {
	int evenLetters= 0;
	int oddLetters = 0;
	for (String word : wordz) {
		if (word.length() %2 ==0) {
			evenLetters += word.length();
		} else {
			oddLetters += word.length();
			
		}
			
		}
return evenLetters>oddLetters;
}

// Method 21:
public static boolean palindromeWord(String palindrome) {
	for (int i=0; i<palindrome.length()/2; i++) {
		if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() -i-1)) {
			return false;
		}
	} return true;
	}}

	


