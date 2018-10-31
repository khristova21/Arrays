import java.util.Arrays;

/**
 * 
 * Array Tests & Helper Methods
 * @author Krisi Hristova
 *
 */
public class ArrayTest 
{
public static void main(String[] args)
	{
	
		int[] myArray = new int[20];
		
		//use a standard for loop b/c you can't modify the values of the array with a 'for each' loop
		//dont need curly braces bc only next (singular) line is being used
		
		for(int i = 0; i < myArray.length;  i++)
			myArray[i]  =(int) (Math.random() * 20)+1;	
	
		System.out.println("The average is " + average(myArray));
		System.out.println("13 appears " + isPresent(myArray, 13));
		System.out.println("at index " + indexOf(myArray, 13));
		System.out.println(Arrays.toString(myArray));


		
	}
//return average of int in array
	//method doesn't need to be public bc inn this case it is just a helper in this class
	private static double average(int[] arr)
	{
		double sum = 0;
		for(int num : arr)
		{
			sum+= num;			
		}
		return sum/arr.length;
	}
	
	private static boolean isPresent(int[] arr, int target)   //checks is target parameter is in the array 
	{
		for(int num : arr)
		{
			if(num == target)
				return true;
		}
		return false;
	}
	
	
	/**
	 * returns the first accourance of target value 
	 * 
	 * @param arr       array
	 * @param target    target value
	 * @return			return index of the first occurance of target or -1 if not found
	 */
	private static int indexOf(int[] arr, int target)     //need to know index of an elemnet so use standard for loop
	{
		for(int i = 0; i < arr.length; i++)
		{
			if( arr[i] == target)
				return i;

		}
		return -1;
	}
	
	
}
