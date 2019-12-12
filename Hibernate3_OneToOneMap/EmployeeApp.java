package p1;

public class EmployeeApp {

	public static void main(String[] args) {
		Address a=new Address();
		
		a.setAddrlane("BTM Layout");
		a.setCity("Banglore");
		a.setState("Karnataka");
		a.setCountry("India");
		
		Employee e=new Employee();
		e.setEname("KL Rahul");
		e.setEmpaddr(a);
		
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.insert(e);
	}
}
