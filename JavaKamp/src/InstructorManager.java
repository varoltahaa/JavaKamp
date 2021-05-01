
public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println("Eðitmen Eklendi : " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("Eðitmen Silindi : " + user.getFirstName());
	}
	
	public void update(User user) {
		System.out.println("Eðitmen Güncellendi : " + user.getFirstName());
	}
	
	
}
