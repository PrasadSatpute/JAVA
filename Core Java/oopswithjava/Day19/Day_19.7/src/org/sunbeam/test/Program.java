package org.sunbeam.test;

import java.lang.annotation.Annotation;

import org.sunbeam.annotations.Author;
import org.sunbeam.model.Book;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Book.class;
		Annotation[] annotations = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			if( annotation instanceof Author ) {
				Author author = (Author) annotation;
				System.out.println(author.name());
			}
		}
	}
}
