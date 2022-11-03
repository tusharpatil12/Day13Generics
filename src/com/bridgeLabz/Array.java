package com.bridgeLabz;

public class Array {
	public static int maximumValue(Integer[]array){
		int max = array[0];
		for(int index = 0; index<array.length; index++){
			if(array[index]>max){
				max =array[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Integer[]integers = {10,20,30};
		int max = Array.maximumValue(integers);
		System.out.println("the maximum Value :"+ max);

	}

}
