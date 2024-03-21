import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Book {
	private String name;
	private String publisher;
	private int price;
	private String pubDate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPubDate() {
		return pubDate;
	}
	
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	public Book(String name, String publisher, int price, String pubDate) {
		this.name = name;
		this.publisher = publisher;
		this.price = price;
		this.pubDate = pubDate;
	}
}

public class test02 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		while (true) {
			System.out.println("----도서재고관리프로그램----");
			System.out.print("1.입력 2.전체출력 3.검색 4.수정: ");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			if (num == 1) {
				System.out.print("책이름: ");
				String s1 = in.next();
				System.out.print("출판사 입력: ");
				String s2 = in.next();
				System.out.print("출판일 입력: ");
				String s3 = in.next();
				System.out.print("가격: ");
				int price = in.nextInt();
				
				books.add(new Book(s1, s2, price, s3));
				System.out.println("도서가 입고되었습니다.");
				System.out.println("총 도서의 수는 " + books.size() + "권 입니다.");
				
			}
			if (num == 2) {
				for (Book book : books) {
					System.out.println(book.getName() + "/" + book.getPublisher() + "/" + book.getPubDate() + "/" + book.getPrice());
				}
				System.out.println("총 도서의 수는 " + books.size());
			}
			if (num == 3) {
				System.out.println("책이름 가나다순(1) 출판일 최근순(2)");
				int n = in.nextInt();
				if (n == 1) {
					books.sort((Comparator<? super Book>) books.get(0));
				}
				if (n == 2) {
					books.sort((Comparator<? super Book>) books.get(3));
					
				}
				
			}
			if (num == 4) {
				System.out.print("수정할 책이름: ");
				String s1 = in.next();
				System.out.print("출판사 입력: ");
				String s2 = in.next();
				System.out.print("출판일 입력: ");
				String s3 = in.next();
				System.out.print("가격: ");
				int price = in.nextInt();
				for (Book book : books) {
					if (book.getName().equals(s1)) {
						book.setPublisher(s2);
						book.setPubDate(s3);
						book.setPrice(price);
					}
				}
				
				System.out.println("도서정보가 수정되었습니다.");
				
			}
			
		}
	}
	
}
		
