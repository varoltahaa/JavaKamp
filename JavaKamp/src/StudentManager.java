
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("��renci Eklendi : " + user.getFirstName());
	}
	@Override
	public void delete(User user) {
		System.out.println("��renci Silindi : " + user.getFirstName());
	}
	@Override
	public void update(User user) {
		System.out.println("��renci G�ncellendi : " + user.getFirstName());
	}
	
}
