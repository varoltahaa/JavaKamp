
public class Student extends User {
	
	
	private String lesson;

	public Student () {}


	public Student(int id, String userName, String password, String firstName, String lastName, String lesson) {
		super(id, userName, password, firstName, lastName);
		this.lesson = lesson;
	}


	public String getLesson() {
		return lesson;
	}


	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	
	

}
