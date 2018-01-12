// Java program to merge two sorted arrays
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Arris
{
    // Merge arr1[0..n1-1] and arr2[0..n2-1] 
    // into arr3[0..n1+n2-1]
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2, Integer[] arr3)
    {
        int i = 0, j = 0, k = 0;
     
        // Traverse both array
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
           if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
           }else {
                arr3[k++] = arr2[j++];
           }
           
        }
     
        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];
     
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
     
    
    public static void mergeArraysCustomize(int[] arr1, int[] arr2, int n1,
    		int n2, Integer[] arr3)
    {
    	int i = 0, j = 0, k = 0;
    	int temp;
    	 boolean hasFound=false;
    	 
    	 // it is needed becase after you remove dublicate values array3 has few size left with null and when u do sort numm will throw an error.
		 /*for( i=0 ;i<arr3.length ; i++) {
		    		 
		    		 arr3[i] =0;;
		    	 }*/
    	 
    	     	
    	// insert  array 1 to array3
    	for( i=0 ;i<arr1.length ; i++) {
    		 
    		 arr3[k++]= arr1[i];
    	 }
    	 // insert  array 2 to array3 without duplicate
    	 for( i=0 ;i<arr2.length ; i++) {
    		 hasFound =false;
    		 for(j=0;j<arr1.length ;j++) {

    			 if(arr2[i]==arr1[j]) {
    				 hasFound=true;
    				 break;

    			 }
    		 }
    		 if(!hasFound) {
    			 arr3[k++]= arr2[i];
    		 }
    	 } 

// sot the aray3 and ifnore is null values as after dublcation we have few null vales    	
    	for( i=0 ;i<arr3.length ; i++) {
    		 
    		for( j=0 ;j<arr3.length-i ; j++) {
    			 
    			 if(arr3[j]!=null && arr3[j+1]!=null  && arr3[j] > arr3[j+1]){
    				  temp=arr3[j];
    				  arr3[j]=arr3[j+1];
    				  arr3[j+1] =temp;
    			 }
    		 }
    		
    	 }
    	 
    	 
    	 for ( i=0; i < n1+n2; i++)
             System.out.print(arr3[i] + " ");
     
    	 //Arrays.sort(arr3);
    }
    
    
    public static void main (String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4};
        int n1 = arr1.length;
     
        int[] arr2 = {1 ,2, 3, 10};
        int n2 = arr2.length;
     
        Integer[] arr3 = new Integer[n1+n2];
      
         
       // mergeArrays(arr1, arr2, n1, n2, arr3);
        
        mergeArraysCustomize (arr1, arr2, n1, n2, arr3);
      
     
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
 