package variable_220915;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		int a = 10; //정수형 변수, 지역변수
		System.out.println("지역변수 a = " + a);
		System.out.println();
		
		Random r = new Random(); //클래스형 변수, 객체 라고 부른다!
		System.out.println("객체 r = " + r);
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt(100)); //0~99
		System.out.println(r.nextInt(26) + 65); //65~90
		/*(int)(Math.random() * (b-a+1) + a)
		 * System.out.println((int)(Math.random() * (90-65+1) + 65)); //65~90 사이에 숫자
		 */
		System.out.println();
		
		String b = new String("사과");
		String c = "딸기"; //문자열 literal 생성
		// String 만 특별히 new 생략 가능 바로 문자열 생성
		System.out.println(b + "\t" + c);
		
	}

}