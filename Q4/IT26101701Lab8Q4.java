import java.util.Scanner;

public class IT26101701Lab8Q4 {
	
    public static void main(String[] args) {
		
		int userInput;
		int searchID;
		
		boolean status = true;
		boolean found = false;
		
		//Declare the Array with size of 8
		int[] studentsArray = new int[8];
		
		//Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
		//Input Student IDs into the array
		for (int count = 0; count < studentsArray.length; count++ ) {
			
			while (status) {
				
				System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
				userInput= input.nextInt();
				
				if (userInput > 0) {
					
					studentsArray[count] = userInput; //Store the Positive Student ID
					break; //Exit inner while loop only, on valid input
				}
				else {
					
					System.out.println("Error: Please Enter ONLY Positive Numbers"); //Display Error
				}
			}
		}
		
		System.out.println();
		
		//Ask user to enter a Student ID to search
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();
		
		//Search for the Student ID in the array
		for (int count = 0; count < studentsArray.length; count++) {
			
			if (studentsArray[count] == searchID) {
				found = true;
				break; //Exit the for loop, if found
			}
		}
		
		System.out.println();
		
		//Display the result
		if (found) {
			System.out.println("Student is Available");
		}
		else {
			System.out.println("Student is NOt Availble");
		}
	
	}

}
