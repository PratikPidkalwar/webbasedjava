package day_10.model;

public class UserValidator {

	public static boolean isValid(User currentUser)
	{
		boolean success=false;
		String currentUserId=currentUser.getUserId();
		String currentPassword=currentUser.getPassword();
		if(currentUserId.equals("admin") && currentPassword.equals("rushi123"))
			success=true;
		return success;
	}
}
