package for_220919;

import java.util.Scanner;

public class For05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X : ");
		int x = scan.nextInt();
		System.out.print("Y : ");
		int y = scan.nextInt();
		
		int mul = 1;
		
		for(int i = 1 ;i<=y; i++) { //for 는 y번 만큼( 승 만큼) 반복 시키려고
			mul = x*mul;
			/* 2 = 2*1
			 * 4 = 2*2
			 * 8 = 2*4
			 */
			
		}
	System.out.print(x +"의" + y + "승 = " + mul);
			
	}

	

}

/*
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx (2*2*2*2*2)
---------------------------
x : 3
y : 4
3의 4승 xx (3*3*3*3)

*/
