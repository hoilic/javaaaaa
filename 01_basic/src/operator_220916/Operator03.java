package operator_220916;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		// 짝수 는 2로 나누면 나머지가 0
		// 2와 3의 공배수 는 2로 나누어 떨이고, 3으로 나누어도 떨어진다.
		Scanner scan =new Scanner(System.in); // 키보드로 입력 받고싶다 는 의미 System.in
		 
		System.out.print("정수를 입력 하시오 : ");
		
		int num = scan.nextInt();
		
		String a = num%2 == 0 ?"짝수" : "홀수";
		String b = num%2 == 0 && num%3 == 0 ?"2 와 3 의 공배수 이다" : "2 와 3 의 공배수 아니다";
		
		//조건연산자 형식 → 조건 ? 참 : 거짓;
		System.out.println(num + " 는 " + a);
		System.out.println(num + " 는 " + b);
		System.out.println(num + " 는 2 와 3 의 " + (num%2 == 0 && num%3 == 0 ?"공배수 이다" : "공배수 아니다"));
		
		
	}

}

/*
[문제]
정수를 입력하여 짝수? 홀수?

[실행결과]
정수 입력하시오 : 12
12 는 짝수
12 는 2와 3의 공배수이다
--------------------------
정수 입력하시오 : 15
15 는 짝수
15 는 2와 3의 공배수 아니다
*/