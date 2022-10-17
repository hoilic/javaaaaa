package constructor_220923;

import java.util.Scanner;

public class Exam {
	private String name, dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111"; //상수화
	
	Scanner scan = new Scanner(System.in);
	
	public Exam () {
		ox = new char[5];
		
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		System.out.print("답 입력 : ");
		this.dap = scan.next();
	}
	public void compare(){
		//for(int i =0; i<ox.length; i++) { // 배열크기 => 배열.length
			for(int i=0; i<dap.length(); i++) { //문자열 크기 => 문자열.length()
			if(dap.charAt(i) == JUNG.charAt(i)) {				
				ox[i] = 'O';
				score += 20;				
			} else ox[i] = 'X';
			
		}// for
	}
	
	
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}

}

/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'

클래스명 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111"; //상수화

* 메소드
생성자 - Scanner 쓰기
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
이름 입력 : 홍길동
답 입력 : 12311                                                                                                                                                                                                                                                                           

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
 */