
public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("��renci Eklendi : " + student.getFirstName());
	}
	
	public void delete(Student student) {
		System.out.println("��renci Silindi : " + student.getFirstName());
	}
	
	public void update(Student student) {
		System.out.println("��renci G�ncellendi : " + student.getFirstName());
	}
	
}
