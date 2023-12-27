package Day_6.beans;

public class Restaurant {

	private int restaurantId;
	private String name;
	private String cuisine;
	private int branchCOunt;
	
	
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}



	public Restaurant(int restaurantId, String name, String cuisine, int branchCOunt) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCOunt = branchCOunt;
	}



	public int getRestaurantId() {
		return restaurantId;
	}



	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCuisine() {
		return cuisine;
	}



	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}



	public int getBranchCOunt() {
		return branchCOunt;
	}



	public void setBranchCOunt(int branchCOunt) {
		this.branchCOunt = branchCOunt;
	}



	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCOunt="
				+ branchCOunt + "]";
	}

	
}
