package ToDo_5.beans;

public class Course {

	private int courseId;
	private String courseTitle;
	private int course_Duration;
	private String course_Provider;
	private int course_Fees;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(int courseId, String courseTitle, int course_Duration, String course_Provider, int course_Fees) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.course_Duration = course_Duration;
		this.course_Provider = course_Provider;
		this.course_Fees = course_Fees;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseTitle() {
		return courseTitle;
	}


	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}


	public int getCourse_Duration() {
		return course_Duration;
	}


	public void setCourse_Duration(int course_Duration) {
		this.course_Duration = course_Duration;
	}


	public String getCourse_Provider() {
		return course_Provider;
	}


	public void setCourse_Provider(String course_Provider) {
		this.course_Provider = course_Provider;
	}


	public int getCourse_Fees() {
		return course_Fees;
	}


	public void setCourse_Fees(int course_Fees) {
		this.course_Fees = course_Fees;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", course_Duration=" + course_Duration
				+ ", course_Provider=" + course_Provider + ", course_Fees=" + course_Fees + "]";
	}
	
	

}
