package LambdaExpressions.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import LambdaExpressions.People;
import LambdaExpressions.Person;

public class SetClass {

	private int INIT_CAPACITY = 10;
	@Test
	public void setStudy(){
		
		Set<Integer> s1 = new HashSet<>(INIT_CAPACITY);
		s1.add(88);
		s1.add(1024);
		s1.add(2);
		s1.add(42);
		s1.add(5);
		//System.out.println(s1);
		Set<Integer> s2 = new HashSet<>();
		s2.add(5);
		s2.add(2);
						
		/*s1.addAll(s2);
		
		/* intersection-----------------------------------------------------------------------------------------------

		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
        System.out.println(intersection);
		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println(difference);*/
	
		//symmetric set difference ---------------------------------------------------------------------------------------
		
		Set<Integer> symmetricDiff = new HashSet<Integer>(s1);
		symmetricDiff.addAll(s2);
		Set<Integer> tmp = new HashSet<Integer>(s1);
		tmp.retainAll(s2);
		symmetricDiff.removeAll(tmp);
		System.out.println(symmetricDiff);
		
		//sort ----------------------------------------------------------------------------------------------
		
		/*s1.stream()
		// .collect(Collectors.toCollection(TreeSet::new))
		.sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList())
		.forEach(e -> System.out.print(e + " " + "\n"));*/
		
		
		
	/*Set<String> names = new HashSet<>();
	names.add("John");
	names.add("Adeline");
	names.add("Steve");
	names.add("Arnolde");
	
	Set<People> people = (Set<People>) People.getPeopleList();
	
	//filters-------------------------------------------------------------------------------------------------------------
	
	people.stream()
	.filter(e->e.getAge()>=25&&e.getAge()<=36)
	.map(People::getName)
	//.collect(Collectors.toCollection(TreeSet::new))
	.collect(Collectors.toSet())
	.forEach(System.out::println);*/
	
	
	
	}
}
