package FoodTruckApp;
import java.util.Scanner;

import FoodTruckEntities.FoodTruck;
import FoodTruckTools.FoodTruckTools;

public class FoodTruckApp {

	public static void main(String[] args) {
	
		FoodTruck storageArray[] = new FoodTruck[5]; // our storage array for food trucks

		Scanner kb = new Scanner(System.in); // our input
		String userInput = "";
		int arrayCount = 0;
		int defaultNumber = 1;
		
		/* FIRST HALF / FIRST LOOP 
		 * 
		 */
		
		while(arrayCount != 5) {
			System.out.println("Please enter a food truck name: ");
			userInput = kb.nextLine(); 
				if (userInput.toLowerCase().equals("quit")) break;
			String truckName = userInput; 
			
			System.out.println("Please enter the food type: ");
			userInput = kb.nextLine();
			String foodType = userInput;
			
			System.out.println("Please rate the food on a 1-5 scale: ");
			userInput = kb.nextLine();
			int rating = Integer.parseInt(userInput);
			
			FoodTruck entryTruck = new FoodTruck(truckName, foodType, rating);
			storageArray[arrayCount] = entryTruck;
			arrayCount++;
		}
		
		int secondMenuChoice = 0;
		FoodTruckTools newCalc = new FoodTruckTools(); // initialize our tools object
/*
 * SECOND HALF OF PROGRAM
 */
		
		while (secondMenuChoice != 4) {
			
			System.out.println("\n\nChoose from the following options: ");
			System.out.println("1. List all existing food trucks ");
			System.out.println("2. See the average rating of the food trucks");
			System.out.println("3. See which truck is the best");
			System.out.println("4. Quit\n");
			secondMenuChoice = kb.nextInt();
			
				switch (secondMenuChoice) {
				case 1:
					newCalc.listAllFoodTrucks(storageArray);
					break;
				case 2:
					System.out.println("Average rating: " + newCalc.foodTruckRatingAverages(storageArray, arrayCount));
					break;
				case 3:
					newCalc.outputBestTruck(storageArray);
					break;
				case 4: 
					break;
				default:
					System.out.println("Invalid input, please try again");
					break;
					
				}
		}
		kb.close();
		
	}
}
