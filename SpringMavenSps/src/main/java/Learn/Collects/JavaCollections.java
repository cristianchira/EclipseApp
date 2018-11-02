package Learn.Collects;


import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;

public class JavaCollections {

private final int INITIAL_CAPACITY=10;



@Test	
public void collectionsTest(){
	Collection<String> el=new ArrayList<>();
	//boolean isEmpty =el.isEmpty();
	el.add("K");
	el.add("P");
   List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
   elements.add("RED");
   elements.add("BLUE");
   elements.add("RED");
   elements.add("A");
   elements.add("A");
   //elements.add(2, "PO");
   //elements.clear();
   elements.addAll(el);
  
  /* Iterator<String> iter =elements.iterator();
   while(iter.hasNext()){
	   
	   System.out.println(iter.next());
   }*/
   //boolean containEl =elements.containsAll(el);
   //elements.remove(0);
   
   /* elements.stream()
   .filter(e -> e.contains("A"))
   .forEach(e -> System.out.println(e));*/
    
    String joined = elements.stream()
    		.filter(e -> !e.contains("A")&& !e.matches("RED"))
    	    .map(Object::toString)
    	    .collect(Collectors.joining(", "));
    
    System.out.println(joined);
}

}
