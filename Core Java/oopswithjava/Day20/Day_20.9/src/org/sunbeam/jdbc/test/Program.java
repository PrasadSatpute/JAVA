package org.sunbeam.jdbc.test;

import java.util.List;
import org.sunbeam.jdbc.dao.BookDao;
import org.sunbeam.jdbc.pojo.Book;

public class Program {
	public static void main4(String[] args) {
		try (BookDao dao = new BookDao()) {
			int count = dao.delete(1026);
			System.out.println(count + " record deleted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main3(String[] args) {
		try (BookDao dao = new BookDao()) {
			int count = dao.update(1026, 5000);
			System.out.println(count + " record updated.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main2(String[] args) {
		try (BookDao dao = new BookDao()) {
			Book book = new Book(1026, "OS", "LPI", "M.K", 3800);
			int count = dao.insert(book);
			System.out.println(count + " record inserted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (BookDao dao = new BookDao()) {
			List<Book> books = dao.getBooks();
			for (Book book : books)
				System.out.println(book.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
