package operator_220916;
//강사님 문제풀이

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		String name, position;
		int basepay, extrapay, total, tax, salary;
		double taxrate;
		
		System.out.println("이름 입력 = ");
		name = scan.nextLine();
		System.out.println("직급 입력 = ");
		position = scan.nextLine();
		System.out.println("기본급 입력 = ");
		basepay = scan.nextInt();
		System.out.println("수당 입력 = ");
		extrapay = scan.nextInt();
		
		
		total = basepay + extrapay;
		
		taxrate = total >= 5000000 ? 0.03 : total >= 3000000 ? 0.02 : 0.01;
		/* 조검 ? 참 : 거짓;
					 조건 ? 참 : 거짓;
					*/
		tax = (int)(total * taxrate);
		salary = total - tax;
		
		System.out.println();
		System.out.println("*** " + name + " " + position +  " 월급 ***");
		System.out.println();
		System.out.println("기본급 : " + df.format(basepay) + "원");
		System.out.println("수당 : " + df.format(extrapay) + "원");
		System.out.println("합계 : " + df.format(total) + "원");
		System.out.println("세금 : " + df.format(tax) + "원");
		System.out.println("월급 : " + df.format(salary) + "원");
	
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