package week4CodingProject;

import java.util.Arrays;

public class week4CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Given Array.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
// the last element subtracted by the first element in ages.	
	System.out.println(ages[ages.length - 1] - ages[0]);  
//New Array  of int with 9 elements.	
	int[] ages2 = {9, 23, 37, 72, 43, 14, 56, 96, 17};
// the last element subtracted by the first element in ages2.	
	System.out.println(ages2[ages2.length - 1] - ages2[0]);	
//this will work for any index smaller than length.
	for (int i =  0; i < ages2.length; i++) {
		System.out.println(ages2[ages2.length - 1] - ages2[i]);
	}
// loop to calculate average age.
	double result = 0;
	for(int i = 1 ; i < ages2.length; i++) {
		
		result += Double.valueOf(ages2[i]);
	
	}
	double average = ((double) result) / ages2.length;
	System.out.println(average);
	//New Array of String: names.
	String[] names = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
	//loop to calculate average name length.
	double numOfLetters = 0;
	for(String name : names) {
	numOfLetters += Double.valueOf(name.length());
	
	}
double avgNameLength = ((double) numOfLetters) / names.length;
	 System.out.println(avgNameLength);
	 //loop to concatenate all the names together
	 String concatNames = " ";
	 for(int i = 0; i < names.length; i++) {
	concatNames += names[i];
	 }
	 System.out.println(concatNames);
	/*
	 * to access to last element in an array use the length method,
	 *  because you can use this method without knowing the length of the array. 
	 *  use arrayName.length - 1 to find the last element you have to subtract one,
	 *   because arrays have 0 based indexes.
	 */
	 System.out.println(ages[ages.length - 1]);
	/*
	 * to access the first element in an array remember arrays are 0 index based.
	 * Use arrayName[0] to fine the first element.
	 */
	 System.out.println(ages[0]);
	 //New int array for nameLengths in names array.
	int[] nameLengths = new int[names.length];
for(int i = 0; i < names.length; i++) {
nameLengths[i] = names[i].length();
}
System.out.println(Arrays.toString(nameLengths));
//loop to calculate the sum of the elements in the nameLengths array.
int result2 = 0;
for (int i = 0; i < nameLengths.length; i++) {
result2 += nameLengths[i];
}
System.out.println(result2);
//concatenation method print statement
System.out.println(concatWord("hello", 7));
//fullName method print statement
System.out.println(fullName("donald", "duck"));
// int array for sumGreaterThan100.
int[] nums  = {12, 25, 36, 43, 28, 51, 83};
//sumGreaterThan100 print statement
System.out.println(sumGreaterThan100(nums));
//double array for doubleArray method.
double[] doubleArray = {1.25, 82.34, 28.43, 4.65, 39.09, 9.99};
System.out.println(averageDouble(doubleArray));
//two double arrays for isFristArrayAverageGreaterThanSecondArray method
double[] firstArray = {3.45, 19.94, 84.87, 46.84, 9.04, 3.37};
double[] secondArray = {4.20, 7.10, 5.10, 6.69, 23.04, 17.86};
// isFristArrayAverageGreaterThanSecondArray method print statement.
System.out.println(isFristArrayAverageGreaterThanSecondArray(firstArray, secondArray));
//willBuyDrink method print statement
System.out.println(willBuyDrink(true, 12.25));
//isfull method dblArray
double[] dblArray = new double[0];
System.out.println(isfull(dblArray));
	}
// method that concatenates a word n number of times
	public static String concatWord(String word, int n) {
String result3 = " ";
for(int i = 0; i < n; i++) {
	 result3 += word;
}
return result3;
	}
// method that takes a firstName and a lastName to make a full name.
	public static String fullName(String firstName, String lastName) {
String result4 = firstName + " " + lastName;
return result4;
	}
	public static boolean sumGreaterThan100(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
	if (sum > 100 ) {
		return true;
		
	}
		}
		return false;
	}
//Method to find the average of a double array.
public static double averageDouble(double[] doubleArray) {
	double dblSum = 0;
	for (int i = 0; i < doubleArray.length; i++) {
		dblSum += doubleArray[i];
	}
	double average = dblSum / doubleArray.length;
	return average;
}
// MEthod that compares the sums of all in elements in two arrays
	public static boolean isFristArrayAverageGreaterThanSecondArray(double[] firstArray, double[] secondArray) {
		double dblSum = 0;
		double dblSum2 = 0;
		for (int i = 0; i < firstArray.length; i++) {
			dblSum += firstArray[i];
		}
		double firstAverage = dblSum / firstArray.length;
		for (int y = 0; y < secondArray.length; y++) {
			dblSum2 += secondArray[y];
		}
		double secondAverage = dblSum2 / secondArray.length;
		if (firstAverage > secondAverage) {
			return true;
		}
return false;
	}
	//method that returns true if both conditions for willBuyDrink is met
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
//method to check is an array is populated with elements
public static boolean  isfull(double[] dblArray) {

 if (dblArray.length > 0) {
	 return true;
 } else {
	 return false;
 }
}
	
	}

