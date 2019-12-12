package p1;

public class StudentApp {

	public static void main(String[] args) {
		Student student=new Student();
		student.setSid("104");
		student.setSname("Amrita");
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.insert(student);
	}
}
