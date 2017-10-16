package applicationPackage;

public abstract class Person {

	private String name;
	private int kada;
	public int count;
	
	public Person(String name, int kada)
	{
		this.setName(name);
		this.setKada(kada);
		count++;
		
	}
	
	public String getName() {return this.name;}
	public int getKada() {return this.kada;}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setKada(int kada)
	{
		this.kada = kada;
	}
	
	public String toString()
	{
		String output = "Name:" + this.getName() + "\nKada: " + this.getKada();
		return output;
	}
}
