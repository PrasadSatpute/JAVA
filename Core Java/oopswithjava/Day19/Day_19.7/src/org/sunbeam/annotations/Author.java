package org.sunbeam.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target( value =  ElementType.TYPE)	//OK
@Target(ElementType.TYPE)	//Ok
//@Retention( value = RetentionPolicy.RUNTIME)	//OK
@Retention(RetentionPolicy.RUNTIME)
public @interface Author{	//Single value Annotation
	String name( );	//Element definition
}