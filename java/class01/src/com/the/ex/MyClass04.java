package com.the.ex;

import java.util.Objects;

class book{
	
	//클래스 필드
	public static int totalBookCount = 1 ;
	
	//인스턴스 필드
	private String bookName = "어린왕자";
	private String bookWriter = "생택쥐베리";
	private String publisher = "민음사";
	private String genre = "동화";
	private int releaseYear = 2003;
	private int bookNumber = 1;

	//접근제어자
	//public private protected default
	//public 모든 지역에서 접근 가능
	//private 같은 클래스 안에서만 접근 가능
	//protected private+상속된 클래스
	//
	
	//getter & setter
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	//equals 추가
	@Override
	public int hashCode() {
		return Objects.hash(bookName, bookWriter, publisher);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		return Objects.equals(bookName, other.bookName) && Objects.equals(bookWriter, other.bookWriter)
				&& Objects.equals(publisher, other.publisher);
	}
	//to String 메소드 추가
	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", bookWriter=" + bookWriter + ", publisher=" + publisher + ", genre="
				+ genre + ", releaseYear=" + releaseYear + ", bookNumber=" + bookNumber + "]";
	}

	//equals 추가
	
	//정적블럭
	static {
		book.totalBookCount=0;
	}
	//생성자
	public book(){
		book.totalBookCount++;
	}
	public book(String bookName, String bookWriter, String publisher, String genre, int releaseYear) {
		book.totalBookCount++;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.publisher = publisher;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.bookNumber=book.totalBookCount;
	}
	
	public void displayInfo() {
		System.out.println("=========도서 정보========");
		System.out.println("총 소장 권 수: "+ book.totalBookCount);		
		System.out.println("책 제목 :" + bookName);
		System.out.println("책 저자 :" + bookWriter);
		System.out.println("출판사 :" + publisher);
		System.out.println("장르 : " + genre);
		System.out.println("출판년도 : " + releaseYear);
		System.out.println("책 고유번호 : " + bookNumber);
	}
	
}

public class MyClass04 {
//	//2. 일일이 변수에 넣어서 메소드 출력
//	//1번 책
//	public static String bookName = "어린왕자";
//	public static String bookWriter = "생택쥐베리";
//	public static String publisher = "민음사";
//	public static String genre = "동화";
//	public static int releaseYear = 2003;
//	public static int bookNumber = 1;
//
//	public static void displayInfo() {
//		System.out.println("=========도서 정보========");
//		System.out.println("책 제목 :" + bookName);
//		System.out.println("책 저자 :" + bookWriter);
//		System.out.println("출판사 :" + publisher);
//		System.out.println("장르 : " + genre);
//		System.out.println("출판년도 : " + releaseYear);
//		System.out.println("책 고유번호 : " + bookNumber);
//	}
//	//2번 책
//		public static String bookName2 = "셜록홈즈";
//		public static String bookWriter2 = "아서코난도일";
//		public static String publisher2 = "민음사";
//		public static String genre2 = "영미문학";
//		public static int releaseYear2 = 1980;
//		public static int bookNumber2 = 2;
//
//		public static void displayInfo2() {
//			System.out.println("=========도서 정보========");
//			System.out.println("책 제목 :" + bookName2);
//			System.out.println("책 저자 :" + bookWriter2);
//			System.out.println("출판사 :" + publisher2);
//			System.out.println("장르 : " + genre2);
//			System.out.println("출판년도 : " + releaseYear2);
//			System.out.println("책 고유번호 : " + bookNumber2);
//		}
	public static void main(String[] args) {
		//Book 정보를 출력하는 프로그램을 단계별로 완성해 보자.
//		//1. 일일이 변수에 넣어서 출력
//		//-책이름,저자,출판사, 장르,출판년도,책 고유번호
//		String bookName = "어린왕자";
//		String bookWriter = "생택쥐베리";
//		String publisher = "민음사";
//		String genre = "동화";
//		int releaseYear = 2003;
//		int bookNumber = 1;
//		
//		System.out.println("=========도서 정보========");
//		System.out.println("책 제목 :" + bookName);
//		System.out.println("책 저자 :" + bookWriter);
//		System.out.println("출판사 :" + publisher);
//		System.out.println("장르 : " + genre);
//		System.out.println("출판년도 : " + releaseYear);
//		System.out.println("책 고유번호 : " + bookNumber);
		
//		//2. 일일이 변수에 넣어서 메소드 출력
//		displayInfo();
		//3. 여러 개의 Book책 정보 출력
//		displayInfo();
//		displayInfo2();
		//4, Book클래스를 모두 인스턴스 필드와 인스턴스 메소드로 출력
//		book a= new book();
//		a.bookName = "어린왕자";
//		a.bookWriter = "생택쥐베리";
//		a.publisher = "민음사";
//		a.genre ="동화";
//		a.releaseYear = 2003;
//		a.bookNumber = 1;
//		a.displayInfo();
//		
//		book b = new book();
//		b.bookName = "정의란 무엇인가?";
//		b.bookWriter = "마이클센델";
//		b.publisher = "길벗";
//		b.genre = "철학";
//		b.releaseYear = 2012;
//		b.bookNumber= 2;
//		b.displayInfo();

		//5. 클래스 필드와 인스턴스 필드 클래스 메소드와 인스턴스 메소드로 구분해서 출력해보자.
//		book a= new book();
//		a.bookName = "어린왕자";
//		a.bookWriter = "생택쥐베리";
//		a.publisher = "민음사";
//		a.genre ="동화";
//		a.releaseYear = 2003;
//		a.bookNumber = 1;
//		a.displayInfo();
//		
//		book b = new book();
//		b.bookName = "정의란 무엇인가?";
//		b.bookWriter = "마이클센델";
//		b.publisher = "길벗";
//		b.genre = "철학";
//		b.releaseYear = 2012;
//		b.bookNumber= 2;
//		b.displayInfo();
		//6. 생성자와 정적 블럭 추가
		book a =new book("정의란 무엇인가?","마이클센델","길벗","철학",2012);
		a.displayInfo();
		book b =new book("어린왕자","생택쥐베리","민음사","동화",2001);
		b.displayInfo();
		
		//7.toString메소드 생성
		
		System.out.println(a);
		System.out.println(b);
		
		//8. equals 추가
		System.out.println(a.equals(b));
		book c =new book("정의란 무엇인가?","마이클센델","길벗","철학",2012);
		c.displayInfo();
		System.out.println(a.equals(c));
	}

}
