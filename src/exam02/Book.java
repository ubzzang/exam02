package exam02;

class Book{
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public Book() {};
	public Book(String title, String author, String publisher, String sort) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return title + "\t" + author + "\t" + publisher + "\t" + sort;
	}
	
}