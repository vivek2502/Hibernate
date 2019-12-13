package p1;

public class BookApp {

	public static void main(String[] args) {
		
		Publisher p1=new Publisher();
		p1.setPname("Pearson");
		Publisher p2=new Publisher();
		p2.setPname("Penguin");
		
		Book b1=new Book();
		b1.setBname("Java");
		b1.setPid(p1);
		Book b2=new Book();
		b2.setBname("Kotlin");
		b2.setPid(p1);
		Book b3=new Book();
		b3.setBname("C#");
		b3.setPid(p2);
		Book b4=new Book();
		b4.setBname("ReactJs");
		b4.setPid(p2);
		
		Hibernatemanager hm=new Hibernatemanager();
		hm.connect();
		hm.insert(b1);
		hm.insert(b2);
		hm.insert(b3);
		hm.insert(b4);
	}
}
