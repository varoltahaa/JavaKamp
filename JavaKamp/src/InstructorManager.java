
public class InstructorManager extends UserManager {

	public void add(Instructor ınsInstructor) {
		System.out.println("Eğitmen Eklendi : " + ınsInstructor.getFirstName());
	}
	
	public void delete(Instructor ınsInstructor) {
		System.out.println("Eğitmen Silindi : " + ınsInstructor.getFirstName());
	}
	
	public void update(Instructor ınsInstructor) {
		System.out.println("Eğitmen Güncellendi : " + ınsInstructor.getFirstName());
	}
	
	
}
