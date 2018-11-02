package LambdaExpressions;


import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class TestLambda {
	

public static void main(String[] args){
		
	List<Person> roster =Person.createRoster();
	//Person.printPersonsWithinAgeRange(roster, 20,28);
	 //CheckPersonEligibleForSelectiveService checkPerson = new CheckPersonEligibleForSelectiveService();
	 //printPersons(roster,checkPerson);
		
	/*printPersons(roster,new CheckPerson() {
		        public boolean test(Person p) {
		            return p.getGender() == Person.Sex.MALE
		                && p.getAge() >= 18
		                && p.getAge() <= 25;
		        }
		    });*/
		
	/*printPersonsWithPredicate(roster,
		     p -> p.getGender() == Person.Sex.MALE
		        && p.getAge() >= 18
		        && p.getAge() <= 25
		);*/
	
/*processPersons(
		     roster,
		     p -> p.getGender() == Person.Sex.MALE
		         && p.getAge() >= 18
		         && p.getAge() <= 25,
		     p -> p.printPerson()
		);*/
	/*processPersonsWithFunction(
	    roster,
	    p -> p.getGender() == Person.Sex.MALE
	        && p.getAge() >= 18
	        && p.getAge() <= 35,
	    p -> p.getEmailAddress(),
	    email -> System.out.println(email)
	);
*/
	roster
    .stream()
    .filter(
        p -> p.getGender() == Person.Sex.MALE
            && p.getAge() >= 18
            && p.getAge() <= 45)
    .map(p -> p.getName())
    .forEach(email -> System.out.println(email));
}

/*private static void printPersons(List<Person> roster, CheckPerson tester) {
	 for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }
	    }
}*/

/*public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }else{
	        	System.out.println(p.getName()+" is out of range");
	        }
	    }
	}*/

/*public static void processPersons(
	    List<Person> roster,
	    Predicate<Person> tester,
	    Consumer<Person> block) {
	        for (Person p : roster) {
	            if (tester.test(p)) {
	                block.accept(p);
	            }
	        }
	}*/

/*public static void processPersonsWithFunction(
	    List<Person> roster,
	    Predicate<Person> tester,
	    Function<Person, String> mapper,
	    Consumer<String> block) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            String data = mapper.apply(p);
	            block.accept(data);
	        }
	    }
	}
*/
}


