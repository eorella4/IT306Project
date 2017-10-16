package applicationPackage;

public class Parent extends Person{
	
	private Student s;

	public Parent(String name, int kada, Student s)
	{
		super(name, kada);
		this.s = s;
	}
	
	public String toString()
	{
		String output = "====Parent====\n" + super.toString();
		output += "\n\n" + this.s.toString();
		return output;
	}
}
