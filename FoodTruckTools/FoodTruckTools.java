package FoodTruckTools;
import FoodTruckEntities.FoodTruck;

public class FoodTruckTools {

	public double foodTruckRatingAverages(FoodTruck Array[], int divisor) {
		double sum = 0.0;
		for (int i = 0 ; i < Array.length ; i++) {
			if (Array[i] == null) break;
			sum += (double)Array[i].getRating();
		}
		return sum / divisor;
	}
	
	public void listAllFoodTrucks(FoodTruck storageArray[]) {
		for (int i = 0 ; i < storageArray.length ; i++) { 
			if (storageArray[i] == null) break;
			System.out.println(returnOneTruck(storageArray,i));
		}
	}
	public void outputBestTruck(FoodTruck StorageArray[]) {
		int best = 0;
		int highestRating = StorageArray[0].getRating();
		for (int i = 0 ; i < StorageArray.length; i++) {
			if (StorageArray[i] == null) break;
			if (StorageArray[i].getRating() > highestRating) { 
				best = i; 
				highestRating = StorageArray[i].getRating();
			}
		}
		System.out.println(returnOneTruck(StorageArray, best));
	}
	public String returnOneTruck(FoodTruck StorageArray[], int pos) {
		String oneLine = StorageArray[pos].getUniqueID() + " " +
						 StorageArray[pos].getName() + " " +
						 StorageArray[pos].getFoodType() + " " +
						 StorageArray[pos].getRating();
		return oneLine;
	}

}