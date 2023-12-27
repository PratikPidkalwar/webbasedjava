package day_8;

import day_7.GreetingSerevice;

public class UserGreetingService implements GreetingSerevice {

	private String userName;
	private String greetingMessage;
	private int userAge;
	
	public UserGreetingService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserGreetingService(String greetingMessage, int userAge, String userName) {
		super();
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
		this.userName = userName;
	}





	public UserGreetingService(String userName, String greetingMessage, int userAge) {
		super();
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getGreetingMessage() {
		return greetingMessage;
	}





	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}





	public int getUserAge() {
		return userAge;
	}





	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}





	@Override
	public String sayGreeting() {
		String finalMessage = greetingMessage + " " + userName + ", your age is " + userAge;
		return finalMessage;

	}
	
	
}
