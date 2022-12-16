package ArrayList.fachkonzept;

public class Person
{
	private String name;
	private int alter;
	
	public Person(String pName, int pAlter)
	{
		name = pName;
		alter = pAlter;
	}
	
	public String liesName()
	{
		return name;
	}
	
	public int liesAlter()
	{
		return alter;
	}
}