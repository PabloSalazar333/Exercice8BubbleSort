package com.exercise8bubblesort.app;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		// Constants declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		int temp = 0;
		
		//Array
		int[] unorderedArray = new int [ELEMENTS_ARRAY];
		int[] orderedArray = new int [ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) 
		{
			unorderedArray[i] = randomNumbers.nextInt(101);
		}
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			System.out.println(unorderedArray[i]+" ");
		}
		
		//Method bubble sort
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			for(int j=0; j<ELEMENTS_ARRAY-1; j++)
			{
				if(unorderedArray[j]>unorderedArray[j+1])
				{
					temp = unorderedArray[j+1];
					unorderedArray[j+1] = unorderedArray[j];
					unorderedArray[j] = temp;
				}
			}
		}
		
		System.out.println(" ");
		
		//Display the disordered vector
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			System.out.println(unorderedArray[i]+" ");
		}
		
	}

}

