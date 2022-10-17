package Compute_220928;

import java.util.Scanner;

public class Div implements Compute {
private int x, y;
	
	public Div() { //생성자는 void 안쓰는거 알죠??
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X의 값 입력 : ");
		x = scan.nextInt();
		System.out.print("Y의 값 입력 : ");
		y = scan.nextInt();
	}	

	
	@Override
	public void disp() {
		System.out.println(x + " / " + y + " = " + (x/y));
		
	}

}
