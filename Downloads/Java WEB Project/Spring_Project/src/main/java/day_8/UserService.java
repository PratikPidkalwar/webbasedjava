package day_8;

import day_7.GreetingSerevice;

public class UserService implements GreetingSerevice {
	
	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome User.";
	}

}
