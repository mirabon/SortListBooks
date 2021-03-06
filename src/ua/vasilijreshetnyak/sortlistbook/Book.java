package ua.vasilijreshetnyak.sortlistbook;

/**
 * @author Vasilij
 *
 */
class Book {
	private String name;
	private String author;
	private int year;

	Book() {
		name = "Без названия";
		author = "Автор неизвестен";
		year = 0;
	}

	public Book(String name, String author, int year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return "Книга под названием " + this.name + " автора " + this.author
				+ " " + this.year + " год/-а издания.";
	}

}
