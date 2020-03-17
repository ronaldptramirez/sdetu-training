package HomeWork1;

import java.util.Scanner;



public class arrayAsParameter {

	  
	/* Driver program to test above function */
    public static void main(String args[]) { 
        int arr[] = {1000, 11, 445, 1, 30, 4000}; 
        int arr_size = 6; 
        int n = arr.length; 
        Pair minmax = getMinMax(arr, 0, arr_size - 1); 

        System.out.printf("\nHighest Element in the array: %d", minmax.min); 
        System.out.printf("\nLowest  Element in the array: %d", minmax.max); 
        System.out.printf("\nAverage of the Elements in the array: %f", (average (arr, n))); 
  
    } 
    
	public static class Pair { 
		  
        int min; 
        int max; 
    } 
  
	//Method to get the lowest and highest value in an array
    public static Pair getMinMax(int arr[], int low, int high) { 
        Pair minmax = new Pair(); 
        Pair mml = new Pair(); 
        Pair mmr = new Pair(); 
        int mid; 
  
        /* If there is only on element */
        if (low == high) { 
            minmax.max = arr[low]; 
            minmax.min = arr[low]; 
            return minmax; 
        } 
  
        /* If there are two elements */
        if (high == low + 1) { 
            if (arr[low] > arr[high]) { 
                minmax.max = arr[low]; 
                minmax.min = arr[high]; 
            } else { 
                minmax.max = arr[high]; 
                minmax.min = arr[low]; 
            } 
            return minmax; 
        } 
  
        /* If there are more than 2 elements */
        mid = (low + high) / 2; 
        mml = getMinMax(arr, low, mid); 
        mmr = getMinMax(arr, mid + 1, high); 
  
        /* compare minimums of two parts*/
        if (mml.min < mmr.min) { 
            minmax.min = mml.min; 
        } else { 
            minmax.min = mmr.min; 
        } 
  
        /* compare maximums of two parts*/
        if (mml.max > mmr.max) { 
            minmax.max = mml.max; 
        } else { 
            minmax.max = mmr.max; 
        } 
  
        return minmax; 
    }
    
    //Function to compute for the average (actual computation)
    
    static double avgRec(int a[], int i, int n) 
    { 
        // Last element 
        if (i == n-1) 
            return a[i]; 
       
        // When index is 0, divide the sum computed by number of elements (arr_size)
        if (i == 0) 
            return ((a[i] + avgRec(a, i+1, n))/n); 
       
        // Compute sum 
        return (a[i] + avgRec(a, i+1, n)); 
    } 
       
    // Function that return average of an array. 
    static double average(int a[], int n) 
    { 
         return avgRec(a, 0, n); 
    } 
  
  
}
