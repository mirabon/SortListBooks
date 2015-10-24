package ua.vasilijreshetnyak.sortlistbook;

import java.util.List;

public class Util {
	/**
	 * Сортировки методом пузырька по полю year (год издания) класса Book. Если
	 * две книги имеют одинаковый год издания, то сортируется по названию книги
	 * в порядке возростания.
	 * 
	 * @param listBooks
	 *            - коллекция книг класса Book
	 */
	public List<Book> sort(List<Book> listBooks) {
		// Сортировка пузырьком
		for (int i = 0; i < listBooks.size() - 1; i++) {
			for (int j = 0; j < listBooks.size() - i - 1; j++) {
				if (listBooks.get(j).getYear() > listBooks.get(j + 1).getYear()) {
					Object tempBook = listBooks.get(j);
					listBooks.set(j, listBooks.get(j + 1));
					listBooks.set(j + 1, (Book) tempBook);
				} else if (listBooks.get(j).getYear() == listBooks.get(j + 1)
						.getYear()) {
					int result = listBooks.get(j).getName()
							.compareTo(listBooks.get(j + 1).getName());
					if (result > 0) {
						Object tempBook = listBooks.get(j);
						listBooks.set(j, listBooks.get(j + 1));
						listBooks.set(j + 1, (Book) tempBook);
					}
				}
			}
		}
		return listBooks;
	}
}
