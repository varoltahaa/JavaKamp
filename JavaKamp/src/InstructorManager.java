
public class InstructorManager extends UserManager {

	public void add(Instructor �nsInstructor) {
		System.out.println("E�itmen Eklendi : " + �nsInstructor.getFirstName());
	}
	
	public void delete(Instructor �nsInstructor) {
		System.out.println("E�itmen Silindi : " + �nsInstructor.getFirstName());
	}
	
	public void update(Instructor �nsInstructor) {
		System.out.println("E�itmen G�ncellendi : " + �nsInstructor.getFirstName());
	}
	
	
}
