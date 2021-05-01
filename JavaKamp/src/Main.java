
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Taha");
		user.setLastName("Varol");
		user.setUserName("varoltahaa");
		user.setPassword("123456");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setUserName("enginDemiro�");
		instructor.setPassword("123456");
		instructor.setDescription("En �yisi");
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("Engin");
		student.setLastName("Demiro�");
		student.setUserName("enginDemiro�");
		student.setPassword("123456");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}

}
