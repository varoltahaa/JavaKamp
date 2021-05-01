
public class UserManager {
	
	public void list () {
		System.out.println("Tüm kullanýcýlar listelendi");
	}
	
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi : " + user.getFirstName() + "" + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi : " + user.getFirstName()+ " " + user.getLastName());
	}
	

}
