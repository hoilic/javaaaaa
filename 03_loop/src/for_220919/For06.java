package for_220919;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				sum = sum+i; //짝수
				System.out.print("+"+i);
			}
			else {
				sum = sum-i;//홀수
				System.out.print("-"+i);
			}
			
		}
		System.out.print("=" + sum);
				
		
	

	}
	 

}

/*
[문제] 결과화면과 똑같이 출력하시오 (for, if)

[실행결과]
-1+2-3+4-5+6-7+8-9+10 = 5
*/
