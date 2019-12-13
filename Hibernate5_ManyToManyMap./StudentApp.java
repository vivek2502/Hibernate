package p1;

import java.util.HashSet;

public class StudentApp {

	public static void main(String[] args) {
		
		Course c1=new Course();
		Course c2=new Course();
		Course c3=new Course();
		c1.setCname("Physics");
		c2.setCname("Math");
		c3.setCname("Chemistry");
		
		HashSet<Course> hs=new HashSet<>();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setSname("Vivek");
		s1.setCourse(hs);
		s2.setSname("Ankit");
		s2.setCourse(hs);
		s3.setSname("Abhishek");
		s3.setCourse(hs);
		
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.insert(s1);
		hm.insert(s2);
		hm.insert(s3);	
	}
}
