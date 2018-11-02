package LambdaExpressions.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.Test;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import LambdaExpressions.Person;

public class ListInterface {
	
	@Test
	public void studyList(){
	List<Integer> intList1 =Arrays.asList(4244,64);	
	List<Integer> intList = new ArrayList<>();
	
	intList.add(56);
	intList.add(6);
	intList.add(7);
	intList.add(90);
	intList.add(90);
	//intList.add(0,89);
	//intList.set(0, 88);
    //Collections.sort(intList);
	
  /* Iterator<Integer> itr = intList.iterator();
     
   while(itr.hasNext()){
    	System.out.println(itr.next());
    }
  */
 /*   
  boolean added=	intList.addAll(intList1);
  intList.removeAll(intList1);
	System.out.println(intList);*/
  
    /*IntStream.range(10,50)
     .forEach(e-> System.out.print(e));*/
    
	
	
	List<Person> persons = Person.createRoster();
	
  List<Integer>  modified=persons
			.stream()
			.filter(p-> p.getAge()>=18
			&&p.getAge()<=28)
			.map(Person::getAge)
			.sorted((p1,p2)->p1.compareTo(p2))
			.distinct()
			.collect(Collectors.toList());
             //.forEach(e-> System.out.print(e+" "));
             
     System.out.println(modified);
   	    
  // int s=   intList.stream().mapToInt(Integer::intValue).sum();
     
	//shuffle----------------------------------------------------------------------------------------------------------------
	 
       /* List<String> suit = Arrays.asList("spades", "hearts","diamonds", "clubs"); 
      	Collections.shuffle(suit);
        System.out.println(suit);*/
        
   //  sorted,distinct list------------------------------------------------------------------------------------------------
     List<String> names= persons
     .stream()
     .filter(e->e.getAge() >=7)
     .map(Person::getName)
     .distinct()  //remove duplicate
     .collect(Collectors.toList());
     
     //.collect(Collectors.toCollection(TreeSet::new));
      
    //.forEach(e ->System.out.println(e));
   	//remove duplicate-----------------------------------------------------------------------------------------
	//List<Integer> removeDuplicate =new ArrayList<>(new HashSet<>(names));
	//List<Integer> removeDuplicate1=ol.stream().distinct().collect(Collectors.toList());
	//sorted--------------------------------------------------------------------------------------------------------------
	Collections.sort(names);
	System.out.println(names);
   //sublist-------------------------------------------------------------------------------------------------------------
   //List<Integer> sublist =u.subList(0,2);
	 
		   

}

	
		
	}
	
	
