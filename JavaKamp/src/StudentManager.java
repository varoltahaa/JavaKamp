
public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("Öğrenci Eklendi : " + student.getFirstName());
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci Silindi : " + student.getFirstName());
	}
	
	public void update(Student student) {
		System.out.println("Öğrenci Güncellendi : " + student.getFirstName());
	}
	
}
