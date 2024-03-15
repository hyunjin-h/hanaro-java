package DBMS;

// 성적 관리 프로그램

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	
	// 필드가 있는 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math) / 3.0;
	}
}

public class StudentMain {
	public static List<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// dao 객체 생성
		StudentDAO dao = new StudentDAO();
		
		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("------------성적 관리 프로그램-------------");
			System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 :");
			int num = in.nextInt();
			if (num == 1) {
				System.out.print("이름입력: ");
				String name = in.next();
				System.out.print("국어성적입력 : ");
				int kor = in.nextInt();
				System.out.print("영어성적입력 : ");
				int eng = in.nextInt();
				System.out.print("수학성적입력 : ");
				int math = in.nextInt();
				
				
				// 레코드 추가
				StudentVO vo = new StudentVO();
				
				vo.setName(name);
				vo.setKor(kor);
				vo.setEng(eng);
				vo.setMath(math);
				vo.setAvg((kor + eng + math) / 3.0);
				int result = dao.insert(vo);
				if (result > 0) {
					System.out.println("회원등록성공!");
				} else {
					System.out.println("회원등록실패!");
				}
			}
			
			if (num == 2) {
				
				List<StudentVO> list = dao.list();
				for (StudentVO student : list) {
					System.out.print("이름:" + student.getName());
					System.out.print(" 국어:" + student.getKor());
					System.out.print(" 영어:" + student.getEng());
					System.out.print(" 수학:" + student.getMath());
					System.out.print(" 평균:" + student.getAvg());
					System.out.println();
				}
			}
			if (num == 3) {
				System.out.print("검색할 이름입력: ");
				String name = in.next();
				
				// 단건조회
				StudentVO student = dao.selectOne(name);
				System.out.println("이름:" + student.getName());
				System.out.print(" 국어:" + student.getKor());
				System.out.print(" 영어:" + student.getEng());
				System.out.print(" 수학:" + student.getMath());
				System.out.print(" 평균:" + student.getAvg());
				System.out.println();
				
			}
			if (num == 4) {
				System.out.print("수정할 이름입력: ");
				String name = in.next();
				StudentVO student = dao.selectOne(name);
				
				System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 :");
				int modi = in.nextInt();
				
				int kor = student.getKor();
				int eng = student.getEng();
				int math = student.getMath();
				
				if (modi == 1) {
					System.out.print("국어 수정 점수:");
					kor = in.nextInt();
					
				} else if (modi == 2) {
					System.out.print("영어 수정 점수:");
					eng = in.nextInt();
				} else if (modi == 3) {
					System.out.print("수학 수정 점수:");
					math = in.nextInt();
				}
				System.out.println();
				student.setName(name);
				student.setKor(kor);
				student.setEng(eng);
				student.setMath(math);
				student.setAvg((kor + eng + math) / 3.0);
				
				int result = dao.update(student);
				if (result > 0) {
					System.out.println("회원업데이트성공!");
				} else {
					System.out.println("회원업데이트실패!");
				}
				
				
			}
			if (num == 5) {
				System.out.print("삭제할 이름입력: ");
				String name = in.next();
				// 삭제
				int result = dao.delete(name);
				if (result > 0) {
					System.out.println("삭제성공");
				} else {
					System.out.println("삭제실패");
				}
			}
			if (num == 6) {
				break;
			}
			
		}
	}
}