package ToDo_7;

public class CourseGreeting implements GreetingService {

	private int courseId;
	private String name;
	private int duration;
	private String provider;
	private int fees;
	
	public CourseGreeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CourseGreeting(int courseId, String name, int duration, String provider, int fees) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String sayGreeting() {
		String finalMessage = "Id: "+courseId + "\tName:" + name+ "\tDuration of Course" + duration+"\tProvider: "+provider+"\tFees: "+fees;
		return finalMessage;

	}

}
