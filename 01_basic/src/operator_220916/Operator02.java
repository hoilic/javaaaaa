package operator_220916;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in); // 키보드로 입력 받고싶다 는 의미 System.in
		 
		System.out.println("점수 입력하시오 : ");
		
		int score = scan.nextInt();
		
		String result = score>=80 && score<=100 ? "합격" : "불합격";
		//조건연산자 형식 → 조건 ? 참 : 거짓;
		System.out.println(result);
		
		

	}

}