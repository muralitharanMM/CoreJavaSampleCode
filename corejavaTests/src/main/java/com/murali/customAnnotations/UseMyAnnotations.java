package com.murali.customAnnotations;


@MyAnnotation(age = 4,name = "Murali",loan = {"hdfc","citi","axis"} )
public class UseMyAnnotations {

	@MyAnnotation
	public String field;
	
	@MyAnnotation	
	public UseMyAnnotations() {
		
	}
	
	@MyAnnotation
	public void method() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Good Morning :-) ");
	}
}

