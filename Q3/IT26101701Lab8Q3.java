import java.util.Scanner;

public class IT26101701Lab8Q3 {
	
    public static void main(String[] args) {
		
		//Create array according to needed size , declare variables and initialize
		int[] numberArray = new int [6];
		int numberCount = 0;
		int userInput;
		
		
		//Create a Scanner object for input
        Scanner input = new Scanner(System.in);
		
		//Capture 6 Positive Numbers into the Array	
        while (numberCount < numberArray.length) {
			
            System.out.print("Enter a Positive Number (" + (numberCount + 1) + "/6): ");
            userInput = input.nextInt();
			
			if (userInput > 0) {
				
				numberArray[numberCount] = userInput;   //Store the Positive Number
				numberCount++;
			}
			
			else {
				
				System.out.println("Error: Please Enter ONLY Positive Numbers");   //Display Error
			}
		}

		
		//Find the Maximum Number in the Array
		int maxNumber  = numberArray[0];
		int count; 
		
		for (count = 0; count < numberArray.length; count++) {
			
			if (numberArray[count] > maxNumber) {
				maxNumber = numberArray[count];
				
			}
			
		}

		//Print Number Array
		System.out.println("\nArray Contents: ");
		for (count = 0; count < numberArray.length; count++) {
			System.out.print (numberArray[count] + " ");
			
		}


        System.out.println();
		
		//Display the Maximum Number
        System.out.println("The Maximum Number Entered: " + maxNumber);
		
    }
}