package prob3;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}

	public void rent() {
		stateCode = 0;
	}

	public void print() {
		if (stateCode == 0) {
			System.out.println("책 제목:" + title + "작가:" + author + "대여 유무:대여중");
			return;
		}
		System.out.println("책 제목:" + title + "작가:" + author + "대여 유무:재고있음");
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
}