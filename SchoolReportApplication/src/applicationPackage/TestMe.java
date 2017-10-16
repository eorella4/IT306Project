package applicationPackage;

public class TestMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] p = new Person[3];
		p[0] = new Student("Tommy", 7);
		p[1] = new Parent("Dad", 9, (Student)p[0]);
		
		
		System.out.println(p[1]);

	}

}
