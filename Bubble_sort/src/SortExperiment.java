/*****************************
 ********RICHARD LUU**********
 *****************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SortExperiment 
{
	public static void main(String[] args)
	{
		final int size = 10000; //Declaring size of array (10, 1000, 10000)
		Random gen = new Random( System.currentTimeMillis() ); // Random generator
		int [] arr1  = new int[size]; // Declaring two arrays
		int [] arr2  = new int[size];
		
		for(int idx = 0; idx < size; idx++) //Inputting random integers into array
		{
			arr1[idx] =  gen.nextInt(20);
		}
		
		for(int idx = 0; idx < arr1.length; idx++) // Copy arr1 to arr2
		{
			arr2 = Arrays.copyOf(arr1, arr1.length);
		}
		
		long t1,t2,t3,t4;
		//TIME STAMPS
		t1 = System.currentTimeMillis();
		sort(arr1);
		t2 = System.currentTimeMillis();
		
		t3 = System.currentTimeMillis();
		Arrays.sort(arr2);
		t4 = System.currentTimeMillis();
		
		System.out.println("Are the arrays equal?  " + Arrays.equals(arr1, arr2)); //Check if sorted arrays are equal
		
		System.out.println("Time using Bubble Sort = " + (t2 - t1) + " ms ");
		System.out.println("Time using Arrays.sort = " + (t4 - t3) + " ms ");
		
		/*for(int idx = 0; idx<arr2.length;idx++)
		{
			System.out.println(arr2[idx]);
		} 
			System.out.println(" ");
		for(int idx = 0; idx<arr1.length;idx++)
		{
			System.out.println(arr1[idx]);
		}*/

	}
	public static void sort (int [] array)
	{	
		for(int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length - 1; j++)
			{
				if (array[j] > array[j+1])
				{int currentValue = array[j+1];
				 array[j+1] = array [j];
				 array[j] = currentValue;} 
			}
		}
	}
}		



	