package LambdaExpressions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class People {
	
String name;
int age;
String email;

public People(String name, int age, String email) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getEmail() {
	return email;
}

public static Set<People> getPeopleList(){
	Set<People> list =new HashSet<>();
	list.add(new People("Adela",24,"adela@gmail.com"));
	list.add(new People("Ioana",32,"ioana@gmail.com"));
	list.add(new People("Lucian",44,"lucian@gmail.com"));
	list.add(new People("Ingrid",36,"ingrid@gmail.com"));
	list.add(new People("Ingrid",36,"ingrid@gmail.com"));
	return list;
}


}
