package com.totango;

import java.util.Arrays;

public class AllExercise {

	public void exercise_01 () {

		System.out.println("Exercise 01\n");

		//Temp values
		int max = 0;
		int secondMax = 0;

		//My array
		int [] num = {13, 35, 2, 11, 33, 2, 34};

		//Print all array 
		System.out.println("Numbers in array: " + Arrays.toString(num));

		//Find biggest number in array
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		//Print biggest number in array
		System.out.println("Biggest number in array: " + max);

		//Find second biggest number in array
		for (int i = 0; i < num.length; i++) {
			if((num[i] > secondMax) && (num[i] != max)) {
				secondMax = num[i];
			}
		}
		//Print second biggest number in array
		System.out.println("Second biggest number in array: " + secondMax + "\n");
	}

	public void exercise_02 () {
		System.out.println("---------------------------------\n");
		System.out.println("Exercise 02\n");

		//My array
		String [] expression = {"'stset lanoitcnuf evol i'"};

		//Print my array
		System.out.println("Text in array: " + Arrays.toString(expression));

		//Convert string array to char array
		String s = "";
		for (String n: expression) {
			s = n;
			char[] c = s.toCharArray();

			//Flip the text
			System.out.print("Reversed array: ");
			for (int i = c.length - 1; i >= 0; i--) {
				
				//Print fliped text
				System.out.print(c[i]);
			}
		}

		
	}
}
