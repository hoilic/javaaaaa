package variable_220915;

import java.util.Random;   //ctrl + shift + O

public class Variable03 {

	public static void main(String[] args) {
		System.out.println("큰 값 = " + Math.max(25,26));
		System.out.println("큰 값 = " + Math.max(78.9,55.8));
		//static 이면 import 할 필요가 없다.
		
		System.out.println();
		
		System.out.println(Math.random()); // 0<= x <1
		System.out.println((int)(Math.random() * (90-65+1) + 65)); //65~90 사이에 숫자
		System.out.println((char)(Math.random() * (90-65+1) + 65)); //65~90 의 값을 문자로
		
		System.out.println(new Random().nextDouble());
	}

}

/*
		 난수
		 - 컴퓨터가 불규칙하게 발생하는 수
		 - 0 <= 난수 < 1
		 - a ~ b 사이의 난수 발생 → (int)(Math.random() * (b-a+1) + a)
		 0 ~0.9
*/