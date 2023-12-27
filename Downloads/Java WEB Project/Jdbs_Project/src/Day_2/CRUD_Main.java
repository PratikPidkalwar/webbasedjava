package Day_2;

import java.util.Collection;

public class CRUD_Main {

	private static void showOneRestaurant()
	{
		DoInterface<Restaurant , Integer> idao=new RestaurantDao();
		
		Restaurant rst=idao.getOne(104);
		
		if(rst!=null)
			System.out.println(rst);
		else
			System.out.println("Restaurant with this Id Is Not Present.");
	}
	
	private static void showAllRestaurant()
	{
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		Collection<Restaurant> allAvailableRestaurants=idao.getAll();
		
		allAvailableRestaurants.stream().forEach((rst)->System.out.println(rst));
		
	}
	
	private static void createNewRestaurant()
	{
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		
		Restaurant rst=new Restaurant(106, "Green Signal", "Oriental", 15);
		
		idao.create(rst);
	}
	
	private static void deleteRestaurant()
	{
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		idao.deleteOne(106);
	}
	
	private static void updateRestaurant()
	{
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		
		Restaurant currentRestaurant=idao.getOne(102);
		
		currentRestaurant.setName("Green and Red Signal");
		currentRestaurant.setCuisine("MultiCuisine");
		
		idao.update(currentRestaurant);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//showAllRestaurant();
		//showOneRestaurant();
		//createNewRestaurant();
		//deleteRestaurant();
		updateRestaurant();
		
	}

}
