import java.util.Comparator;

public class Person implements Comparator<Person>
{
	private String name;
	private int id;
	
	public Person(String name, int id)
	{
		this.id = id;
		this.name = name;
	}
	public String getName()
	{
		return this.name;
		
	}
	public int getID()
	{
		return this.id;
	}
	public String toString()
	{
		return this.name+" "+this.id;
	}
	@Override
	public int compare(Person o1, Person o2)
	{
		if(o1.id<o2.id)		return -1;
		else if(o1.id>o2.id)return 1;
		else				return 0;
	}
	
	public static final Comparator<Person>SORT_NAME_ID = Comparator.comparing(Person::getName).thenComparing(Person::getID);

}
