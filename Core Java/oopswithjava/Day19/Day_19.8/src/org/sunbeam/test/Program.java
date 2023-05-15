package org.sunbeam.test;

import java.lang.annotation.Annotation;

import org.sunbeam.annotations.Author;
import org.sunbeam.annotations.Authors;
import org.sunbeam.model.Book;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Book.class;
		Annotation[] annotations = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			if( annotation instanceof Authors ) {
				Authors authors = (Authors) annotation;
				Author[] arr = authors.value();
				for (Author author : arr) {
					System.out.println(author.name());
				}
			}
		}
	}
}
