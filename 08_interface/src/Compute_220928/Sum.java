package Compute_220928;

import java.util.Scanner;

public class Sum implements Compute{//Sum 은 Compute 가 가지고있는 메소드를 오버라이드(구현) 해줘야한다
	private int x, y;
	
	public Sum() { //생성자는 void 안쓰는거 알죠??
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X의 값 입력 : ");
		x = scan.nextInt();
		System.out.print("Y의 값 입력 : ");
		y = scan.nextInt();
		
	}
	
	@Override
	public void disp() {
		System.out.println(x + " + " + y + " = " + (x+y));
		
	} 

}
