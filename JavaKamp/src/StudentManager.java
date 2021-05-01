
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Öðrenci Eklendi : " + user.getFirstName());
	}
	@Override
	public void delete(User user) {
		System.out.println("Öðrenci Silindi : " + user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("Öðrenci Güncellendi : " + user.getFirstName());
	}
	
}
