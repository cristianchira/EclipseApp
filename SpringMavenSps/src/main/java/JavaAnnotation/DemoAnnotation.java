package JavaAnnotation;

import java.lang.annotation.Annotation;

public class DemoAnnotation {
	public static void main(String[] args) {

		AnnotationType at = new AnnotationType("Annotation", 25);

		Class c = at.getClass();

		Annotation an = c.getAnnotation(AnnotationName.class);

		AnnotationName ann = (AnnotationName) an;
		System.out.println(ann.someT() + ann.someInt());
	}
}
