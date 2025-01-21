package com.murali.customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(ElementType.CONSTRUCTOR) //only applicable to constructor
//@Target(ElementType.FIELD) //only applicable for field
//@Target(ElementType.METHOD) //only applicable for method

//applicable for all if Target is not mentioned
public @interface MyAnnotation {

	int age() default 0;
	String name() default "murali";	
	String[] loan() default {""};
}
