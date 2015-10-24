package ua.vasilijreshetnyak.sortlistbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		// Наполнение коллекции книгами в формате
		List<Book> listBooks = new ArrayList<Book>();
		listBooks.add(new Book("Технология программирования на С++", "Литвиненко Н. А.", 2014));
		listBooks.add(new Book("Программирование. Принципы и практика использования C++", "Бьерн Страуструп", 2013));
		listBooks.add(new Book("Объектно-ориентированное программирование в С++", "Р. Лафоре", 2010));
		listBooks.add(new Book("Java EE. Паттерны проектирования для профессионалов", "Йенер М.", 2016));
		listBooks.add(new Book("Spring 4 для профессионалов", "Крис Шефер", 2015));
		listBooks.add(new Book("Java 8 in Action. Lambdas, Streams, and functional-style programming", "Raoul-Gabriel Urma", 2014));

		//сортировка книг в коллекции.
		listBooks = new Util().sort(listBooks);
		
		// вывод в консоль отсортированной коллекции по году выпуска от самой
		// старой до самой новой
		Iterator<Book> i1 = listBooks.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}