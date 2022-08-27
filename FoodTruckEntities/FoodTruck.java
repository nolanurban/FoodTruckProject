/*
 * create the class fields and then setters and getters for each object.
 */


package FoodTruckEntities;

public class FoodTruck {
	private int rating;
	private static int startID = 2525; // in the year 2525
	private int uniqueID;
	private String name;
	private String foodtype;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
		this.uniqueID++;
	}
	public int getUniqueID() {
		return this.uniqueID;
	}
	
	public void setFoodType(String foodtype) {
		this.foodtype = foodtype;
	}
	
	public String getFoodType() {
		return this.foodtype;
	}
	
	public FoodTruck() { } // default
	
	public FoodTruck(String name, String foodtype, int rating) { // got rid of parameter
		this.uniqueID = startID;
		startID++;
		this.name = name;
		this.foodtype = foodtype;
		this.rating = rating;
	}
	
}
