package SungJuk_220929;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	// 객체 값을 저장하기 위해서 , 
	//SungJukDTO 클래스 타입의 객체값 list 인  ArrayList 를 선언
	//private 로 하여 같은 class 내에서만 쓸수 있음
	
	public void menu() { //메뉴함수 만들기
		Scanner scan = new Scanner(System.in);
		int num;
		SungJuk sungJuk = null; 
		// 지역변수 이기 때문에 초기값을 설정하여 
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1. 입력 ");
			System.out.println("   2. 출력 ");
			System.out.println("   3. 수정 ");
			System.out.println("   4. 삭제 ");
			System.out.println("   5. 정렬 ");
			System.out.println("   6. 끝 ");
			System.out.println("***************");
			System.out.print("   번호 :  ");
			num = scan.nextInt();
			if(num == 6) break;
			
			if(num == 1) {
				sungJuk = new SungJukInsert();
				//1번을 누르면 SungJukInsert 가 생성되서 sungJuk에 담음

			}
			else if(num ==2){
				sungJuk = new SungJukList();

			}
			else if(num ==3) {
				sungJuk = new SungJukUpdate();
			}
			else if(num ==4) {
				sungJuk = new SungJukDelete();
			}
			else if(num ==5) {
				sungJuk = new SungJukSort();
			}
			else {
				System.out.println("1~6중에 선택하세요");
				continue;
			}
			sungJuk.execute(list);//호출
			//1번 생성후 sungJuk ( SungJukInsert) 으로 넘어가 
			// execute 클래스에 list 가 실행
			
		}// while	
		
	}// menu

}
