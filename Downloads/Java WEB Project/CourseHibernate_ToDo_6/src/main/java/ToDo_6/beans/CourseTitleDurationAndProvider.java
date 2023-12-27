package ToDo_6.beans;

public class CourseTitleDurationAndProvider {

	private String course_title;
	private int course_duration;
	private String course_provider;
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public int getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	public String getCourse_provider() {
		return course_provider;
	}
	public void setCourse_provider(String course_provider) {
		this.course_provider = course_provider;
	}
	public CourseTitleDurationAndProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseTitleDurationAndProvider(String course_title, int course_duration, String course_provider) {
		super();
		this.course_title = course_title;
		this.course_duration = course_duration;
		this.course_provider = course_provider;
	}
	@Override
	public String toString() {
		return "CourseTitleDurationAndProvider [course_title=" + course_title + ", course_duration=" + course_duration
				+ ", course_provider=" + course_provider + "]";
	}
	
	
}
