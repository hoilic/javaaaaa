package Compute_220928;

import java.util.Scanner;

public class ComputeService {
	
	public void menu() { //menu 메소드 생성 
		Scanner scan = new Scanner(System.in);
		int num;
		Compute compute = null;
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("   1. 합");
			System.out.println("   2. 차");
			System.out.println("   3. 곱");
			System.out.println("   4. 몫");	
			System.out.println("   5. 끝내기");	
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = scan.nextInt(); // 초기값이 scan.nextInt() 이다.
			
			if(num == 5) break;
			if(num == 1) {//Sum 클래스에 disp() 호출
				compute = new Sum(); //부모 = 자식
			}// 			
			else if(num == 2) {
				compute = new Sub(); // Sub 클래스에 disp() 호출
			}				
			else if(num == 3) {
				compute = new Mul(); 
			}			
			else if(num == 4) {
				compute = new Div(); 
			}			
				compute.disp();
				
		}//while
		
	}//menu

}
