package Day_7.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="new_restaurant_master")
public class Restaurant {

	@Id
	@Column(name="Restaurant_Id")
	private int restaurantId;
	@Column(name="Rest_Name")
	private String name;
	@Column(name="Rest_Cuisine")
	private String cuisine;
	@Column(name="Branches")
	private int branchCount;
	
	
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}



	public Restaurant(int restaurantId, String name, String cuisine, int branchCOunt) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.branchCount = branchCOunt;
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
		return branchCount;
	}



	public void setBranchCOunt(int branchCOunt) {
		this.branchCount = branchCOunt;
	}



	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", cuisine=" + cuisine + ", branchCOunt="
				+ branchCount + "]";
	}

	
}
