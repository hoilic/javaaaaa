package operator_220916;
//강사님 문제풀이
import java.util.Random;

public class Homework01_01 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int dice1 = (int)((Math.random() * 6) + 1);
		int dice2 = r.nextInt(6)+1; // 1~6
		//int dice2 = r.nexInt(6); // 0~5
		int sum = dice1 + dice2;

		/* 조검 ? 참 : 거짓;
		 조건 ? 참 : 거짓;
		*/
		
		int max = dice1 >=  dice2 ? dice1 : dice2;
		String result = dice1 > dice2 ? "주사위1 이" + dice1 + "으로 승"
										: dice1 < dice2 ? "주사위2 이" + dice2 + "으로 승"
														: "주사위1 과 주사위2가 같다";
		System.out.println("주사위1 : " + dice1 +"\t" +  "주사위2 : " + dice2);
		System.out.println(result);
		System.out.println("합 = " + sum);
		
	}

}
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