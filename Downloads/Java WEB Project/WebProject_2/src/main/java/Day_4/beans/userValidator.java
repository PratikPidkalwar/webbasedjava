package Day_4.beans;

public class userValidator {

	public static boolean isValid(User currentUser)
	{
		boolean success=false;
		
		String currentUserId=currentUser.getUserId();
		String currentPassword=currentUser.getPassword();
		
		if(currentUserId.equals("admin") && currentPassword.equals("pass123"))
			success=true;
		
		return success;
	}
}
