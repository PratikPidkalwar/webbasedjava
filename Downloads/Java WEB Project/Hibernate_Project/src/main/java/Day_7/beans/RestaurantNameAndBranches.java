package Day_7.beans;

public class RestaurantNameAndBranches {

	private String restaurantName;
	private int restaurantBanchCount;
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public int getRestaurantBanchCount() {
		return restaurantBanchCount;
	}
	public void setRestaurantBanchCount(int restaurantBanchCount) {
		this.restaurantBanchCount = restaurantBanchCount;
	}
	public RestaurantNameAndBranches() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantNameAndBranches(String restaurantName, int restaurantBanchCount) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantBanchCount = restaurantBanchCount;
	}
	@Override
	public String toString() {
		return "RestaurantNameAndBranches [restaurantName=" + restaurantName + ", restaurantBanchCount="
				+ restaurantBanchCount + "]";
	}
	
	
}
