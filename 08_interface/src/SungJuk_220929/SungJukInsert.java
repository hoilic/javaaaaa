package SungJuk_220929;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		//  ArrayList<SungJukDTO> list 의 객체를 입력 받아서 실행하는 조건의 execute 클래스
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int no = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		SungJukDTO sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		sungJukDTO.calc();
		
		list.add(sungJukDTO); //arraylist 형태의 list 라는 공간을 만들고 sungJukDTO 라는 주소값을 추가 시켜라
		System.out.println("입력되었습니다");
	}
	
}
