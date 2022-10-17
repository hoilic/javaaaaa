package operator_220916;


public class Homework02 {

	public static void main(String[] args) {
		
		//char ch = (char)((Math.random()*26)+65);
		char ch = 'a';
		int r1 = ch>=65 ? ch - 32 : ch;
		int r2 = ch<97 ? ch + 32 : r1;
		// int r2 먼저 실행된다.
		System.out.print(ch + " → ");		
		System.out.println((char)r2);		
		
	
		
		

		/*
		[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b         e -> E
//char ch = 'B';
char ch = 'e';
97 122
65 90
		 */

	}

}