package DBMS;

// 데이타를 담는 클래스 종류
// VO : View Object, 값의 수정이 안되고, 로직이 없음.
// DTO : Data Transfer Object, 레이어간 데이타 전송 용도.
// ENTITY : DB 컬럼과 1:1로 연결됨. Spring JPA에서 주로 사용.

// 데이타의 조작을 하는 클래스
// DAO : Data Acess Object, DB 조작 메소드들의 집합, CURD 메소드들.

public class StudentVO {
	// DB 컬럼과 1:1 매칭
	// INT : int (Integer)
	// VARCHAR : String
	// DATE : LocalDate
	// DATETIME : LocalDateTime
	private String name;// 이름
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
}