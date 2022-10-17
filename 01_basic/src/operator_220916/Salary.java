package operator_220916;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); // 키보드로 입력 받고싶다 는 의미 System.in
		 
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		
		System.out.print("직급 입력 : ");
		String position = scan.nextLine();
		
		System.out.print("기본급 입력 : ");
		int basepay = scan.nextInt();
		
		System.out.print("수당 입력 : ");
		int extrapay = scan.nextInt();
		
		System.out.println();
		System.out.println(" *** " + name + position + "월급 *** ");
		System.out.println();
		
		System.out.println("기본급 : " + new DecimalFormat().format(basepay)+"원");
		System.out.println("수당 : " + new DecimalFormat().format(extrapay)+"원");
		int sum = basepay + extrapay;
		System.out.println("합계 : " + new DecimalFormat().format(sum)+"원");
		
		int tax = (int)(sum >= 5000000 ? sum*0.03 : (sum >= 3000000 ? sum*0.02 : sum*0.01) ) ; 

		int monthlypay = (int)(sum-tax);
		
		System.out.println("세금 : " + new DecimalFormat().format(tax)+"원" );
		System.out.println("월급 : " + new DecimalFormat().format(monthlypay)+"원" );
		
		
		
		//조건연산자 형식 → 조건 ? 참 : 거짓;
		
		

	}

}
/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당 을 입력하여 합계, 세율, 세금, 월급을 출력하시오
단, 합계가 5,000,000원이 이상이면 3%
		3,000,000원이 이상이면 2%
		아니면 1%
		
	합계 = 기본급 + 수당
	세금 = 합계 * 세율
	월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 :4,900,000
수당 입력 : 200,000

*** 홍길동 부장 월급 ***

기본급 : 4,900,000 원
수당 : 200,000 원
합계 : 5,100,000 원
세금 : 
월급 : 



*/