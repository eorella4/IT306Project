package applicationPackage;

public class Student extends Person{
	
	public Student(String name, int kada)
	{
		super(name, kada);
	}
	
	public String toString()
	{
		String output = "====Student====\n" + super.toString();
		return output;
	}

}
