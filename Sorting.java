import java.util.Scanner;
import java.util.Arrays;
/**
 * @author dell 2
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("WELCOME TO MY SORTING ALGORITHM");
		/// USER MAKES A CHOICE BETWEEN THE 4 SORTING METHODS ///
		
		int choice = 0;
		Scanner Mykey = new Scanner(System.in);
		
		do {
		 System.out.println("--Press 1 for Selection Sort--");
		 System.out.println("--Press 2 for Insertion Sort--");
		 System.out.println("--Press 3 for Bubble Sort--");
		 System.out.println("--Press 4 for Quick Sort--");

	       choice = Mykey.nextInt();
	       
	       if (choice == 1) {
	    	   System.out.println("Welcome to Selection Sort");
	    	   
	    		// User input values in array ////
	    	   int[] inputArray = new int[6];  
	    	   Scanner Mykey1 = new Scanner(System.in);
	    	   //to enter values in array
	    	   System.out.println("Please enter a list of 6 numbers by pressing 'Enter' after each number you input: ");
	    	   for (int i = 0;i<inputArray.length ; i++) {
	    	   inputArray[i] = Mykey1.nextInt();
	    	   }

	    	   //method of printing value of an array
	    	   System.out.print("Array: " + Arrays.toString(inputArray));


	    	   //// Selection Sort  /////
	    	   int length = inputArray.length;
	    	   int minValueIndex;

	    	 // outer loop //
	    	   for (int i = 0; i < length; i++) {
	    	   minValueIndex = i;
	    	   // Inner Loop //
	    	   for (int j = i; j < length; j++) {

	    	   if (inputArray[minValueIndex] > inputArray[j]) {
	    	    minValueIndex = j;
	    	   }
	    	   }
	    	   int temp = inputArray[minValueIndex];
	    	   inputArray[minValueIndex] = inputArray[i];
	    	   inputArray[i] = temp;
	    	   System.out.print("\nStep " + i + " : ");
	    	   System.out.print(Arrays.toString(inputArray));
	    	
	    	   }
	    	   System.out.println(" ");
	    	   System.out.print("Sorted Result: ");
	    	   System.out.print(Arrays.toString(inputArray));
	  
	    	   }
	        	   
	    	   if (choice == 2) {
	    		   System.out.print("Welcome to Insertion Sort");
	    		   
	    		// User input values in array ////
		    	   int[] inputArray = new int[6];  
		    	   Scanner Mykey1 = new Scanner(System.in);
		    	   //to enter values in array
		    	   System.out.println("");
		    	   System.out.println("lease enter a list of 6 numbers by pressing 'Enter' after each number you input: ");
		    	   for (int i = 0;i<inputArray.length ; i++) {
		    	   inputArray[i] = Mykey1.nextInt();
		    	   }

		    	   //method of printing value of an array
		    	   System.out.print("Array: " + Arrays.toString(inputArray));

		    	   //// Insertion Sort  /////
		   
	    				  for(int i = 1; i < inputArray.length; i++){
	    				    int value = inputArray[i];
	    				    int j = i - 1;
	    				    while(j >= 0 && inputArray[j] > value){
	    				      inputArray[j + 1] = inputArray[j];
	    				      j = j - 1;
	    				    }
	    				    inputArray[j + 1] = value;
	    				  }
	    				System.out.println("");
	  	    	        System.out.print("Sorted Result: ");
	  	    	        System.out.println(Arrays.toString(inputArray));
	    				}
	    		   
		    if (choice == 3) {
		    	  System.out.print("Welcome to Bubble Sort");
		    	  
		    	  int n, i, j, swap;
				    Scanner Mykey1 = new Scanner(System.in);
				    System.out.println("");
				    System.out.print("Input number of integers to sort: ");
				    n = Mykey1.nextInt();
				 
				    int inputArray[] = new int[n];
				 
				    System.out.println("Enter " + n + " integers by pressing 'Enter' after each integer you input: ");
				    for (i = 0; i < n; i++)
				    	inputArray[i] = Mykey1.nextInt();
				   
				    for (i = 0; i < ( n - 1 ); i++) {
				      for (j = 0; j < n - i - 1; j++) {
				        if (inputArray[j] > inputArray[j+1]) // for decending order
				        {
				          swap       = inputArray[j];
				          inputArray[j]   = inputArray[j+1];
				          inputArray[j+1] = swap;
				        }
				      }
				    }
				 
				    System.out.println("Sorted Result: ");
				   System.out.print("Array: " + Arrays.toString(inputArray));    
		      }
		    
		   if (choice == 4) {
			   System.out.print("Welcome to Quick Sort");
			
			   
			   
			   
			   
			   
		   } 
		  
		}while ((choice != 1)&&(choice != 2)&&(choice != 3)&&(choice != 4));		 
	}

}
