package Classes;


public class TestClasses {

	public static void main(String[] args) {
		 class EnglishGreeting {
	            String name = "world";
	            public void greet() {
	                greetSomeone("world");
	            }
	            public void greetSomeone(String someone) {
	                name = someone;
	                System.out.println("Hello " + name);
	            }
	        }
       new EnglishGreeting().greetSomeone("Chrys");
}
}