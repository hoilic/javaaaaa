package operator_220916;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		int d1 = (int)(Math.random()*6+1); // 1~6
		int d2 = (int)(Math.random()*6+1);
		String s1 = d1>d2 ? "주사위1 이 "+d1+ "으로 승" : (d2>d1 ? "주사위2 이"+ d2+ "으로 승" : "주사위1 과 주사위2 같다");
		int sum = d1+d2;
		
		/* 조검 ? 참 : 거짓;
		            조건 ? 참 : 거짓;
		*/
		
	
		System.out.println("주사위1 : " + d1);
		System.out.println("주사위2 : " + d2);
		System.out.println(s1);
		
		
		
	
		System.out.println("합 = " + sum);
		
		
		
		/*
		 * [문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 이 3으로 승
합 = 4
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 이 6으로 승
합 = 10
-----------------------------
주사위1 : 3   주사위2 :3
주사위1과 주사위2가 같다
합 = 6
		 */

	}

}