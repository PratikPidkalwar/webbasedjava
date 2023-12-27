package Day_2;

import java.util.Collection;

public interface DoInterface<T, K> {

	Collection<T> getAll();	//Method to retrieve all the records.
	
	T getOne(K key);	//Method to retrieve single record based upon its identity(Id)
	
	void create(T t);	//Method to create a new Record.
	
	void deleteOne(K key);	//Method to delete a one record based upon id.
	
	void update(T t);	//Method for Updating the Record.
	
}
