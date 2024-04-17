import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test 
{

	public static void main(String[] args) 
	{
		Person p = new Person("Zuko", 123);
		Person p2 = new Person("Aang", 456);
		Person p3 = new Person("Bog",776 );
		Person p4 = new Person("Bog", 41);
		
		List<Person>people = new ArrayList<>();
		people.add(p);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		System.out.println(people);
		Collections.sort(people,Person.SORT_NAME_ID);
		System.out.println(people);
	}

}
