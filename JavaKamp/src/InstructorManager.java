
public class InstructorManager extends UserManager {

	public void add(Instructor ýnsInstructor) {
		System.out.println("Eðitmen Eklendi : " + ýnsInstructor.getFirstName());
	}
	
	public void delete(Instructor ýnsInstructor) {
		System.out.println("Eðitmen Silindi : " + ýnsInstructor.getFirstName());
	}
	
	public void update(Instructor ýnsInstructor) {
		System.out.println("Eðitmen Güncellendi : " + ýnsInstructor.getFirstName());
	}
	
	
}
