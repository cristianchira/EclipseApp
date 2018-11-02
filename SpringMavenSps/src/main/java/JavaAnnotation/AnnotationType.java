package JavaAnnotation;

//Marker annotation
//Single value anotation
//Multiple value annotation

@AnnotationName(someT = "Another value5", someInt = 55)
public class AnnotationType {
	String someString;
	int someInt;

	public AnnotationType(String someString, int someInt) {
		super();
		this.someString = someString;
		this.someInt = someInt;
	}

}
