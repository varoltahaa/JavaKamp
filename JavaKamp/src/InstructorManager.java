
public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println("E�itmen Eklendi : " + user.getFirstName());
	}
	
	public void delete(User user) {
		System.out.println("E�itmen Silindi : " + user.getFirstName());
	}
	
	public void update(User user) {
		System.out.println("E�itmen G�ncellendi : " + user.getFirstName());
	}
	
	
}
