package p1;

public class StudentApp {

	public static void main(String[] args) {
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.select("101");

	}

}
