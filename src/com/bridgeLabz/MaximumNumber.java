package com.bridgeLabz;

public class MaximumNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to the Generics Problems");
        System.out.println("\n Test the Maximum Three Numbers");
        Integer firstNumber = 12;
        Integer secondNumber = 15;
        Integer thirdNumber = 18;
        findMax(firstNumber,secondNumber,thirdNumber);
    }
     static void findMax(Integer firstNumber,Integer secondNumber,Integer thirdNumber ){
        Integer maximumNumber;

        if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
            maximumNumber = firstNumber;
        }
        else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
            maximumNumber = secondNumber;
        }
        else {
            maximumNumber = thirdNumber;
        }
        System.out.println(maximumNumber + " is max out of "+firstNumber+", "+secondNumber+" and "+thirdNumber);


     }
     public static void findMax(Float firstNumber, Float secondNumber, Float thirdNumber) {
    	 Float maximumNumber;

    	 if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
    		 maximumNumber = firstNumber;
    	 } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
    		 maximumNumber = secondNumber;
    	 } else {
    		 maximumNumber = thirdNumber;
    	 }
    	 System.out.println(maximumNumber + " is max out of " + firstNumber + ", " +secondNumber + " and " +thirdNumber);
     }
     public static void findMaxString(String firstString, String secondString, String thirdString) {
    	 String maximumstring;

    	 if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0) {
    		 maximumstring = firstString;
    	 } else if (secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) > 0) {
    		 maximumstring = secondString;
    	 } else {
    		 maximumstring = thirdString;
    	 }
    	 System.out.println(maximumstring + " is max out of " + firstString + ", " +secondString + " and " +thirdString);
     }

}

