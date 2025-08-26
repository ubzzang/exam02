package exam02;

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setTitle("82년생 김지영");
		b1.setAuthor("조남주");
		b1.setPublisher("민옵사");
		b1.setSort("소설");
		
		Book b2 = new Book("파리아파트","기욤뭐소","밝은세상","소설");
		
		Book b3 = new Book("자료구조");
		b3.setAuthor("이자료");
		b3.setPublisher("DB출판사");
		b3.setSort("컴퓨터/IT");
		
		System.out.println("제목\t\t저자\t출판사\t분류");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
