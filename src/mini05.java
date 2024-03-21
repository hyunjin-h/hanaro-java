// 성적 관리 프로그램

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

public class mini05 {
	static List<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
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
				
				list.add(new Student(name, kor, eng, math));
			}
			
			if (num == 2) {
				for (Student st : list) {
					System.out.println("이름: " + st.name + " 국어: " + st.kor
							+ " 영어: " + st.eng + " 수학: " + st.math + " 평균: " + st.avg);
					
				}
			}
			if (num == 3) {
				System.out.print("검색할 이름입력: ");
				String name = in.next();
				
				for (Student st : list) {
					if (Objects.equals(st.name, name)) {
						System.out.println("이름: " + st.name + " 국어: " + st.kor
								+ " 영어: " + st.eng + " 수학: " + st.math + " 평균: " + st.avg);
						
					}
				}
			}
			if (num == 4) {
				System.out.print("수정할 이름입력: ");
				String name = in.next();
				System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 :");
				int modi = in.nextInt();
				
				for (Student st : list) {
					int score = 0;
					if (Objects.equals(st.name, name)) {
						// 같은 student만 뽑아내고 조건문 코드는 빼내는 것이 더 좋다. 플랫한 코드가 더 좋은것
						if (modi == 1) {
							System.out.print("국어 수정 점수:");
							score = in.nextInt();
							st.kor = score;
						} else if (modi == 2) {
							System.out.print("영어 수정 점수:");
							score = in.nextInt();
							st.eng = score;
						} else if (modi == 3) {
							System.out.print("수학 수정 점수:");
							score = in.nextInt();
							st.math = score;
						}
						st.avg = (st.eng + st.kor + st.math) / 3.0;
					}
				}
				
				
			}
			if (num == 5) {
				System.out.print("삭제할 이름입력: ");
				String name = in.next();
				for (Student st : list) {
					if (Objects.equals(st.name, name)) {
						list.remove(st);
						break;
					}
				}
			}
			if (num == 6) {
				break;
			}
			
		}
	}
}