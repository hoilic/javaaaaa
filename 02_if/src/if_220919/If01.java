package if_220919;
import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("데이터 입력 : ");
		int a = scan.nextInt();
		
		if(a >= 50) System.out.println(a + "는 50보다 크거나 같다");
		else System.out.println(a + "는 50보다 작다");
		System.out.println();
		
		// A - C
		if(true)
			if(true) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		// B - C
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C");
		System.out.println();
		
		// C
		if(false)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("C"); //바로 위 if 는 건너뛰고 C 로 넘어옴
		System.out.println();
		
		if(a>= 'A' && a<='Z') //65~90
			System.out.println( (char)a + "는 대문자");
		else if(a>= 'a' && a<='z') // 97~122
			System.out.println( (char)a + "는 소문자");
		else
			System.out.println( (char)a + "는 숫자이거나 특수문자");

		/*
		 *﻿
if (조건) A; b;
T : A → B
F : B


if (조건) A; b; C;
T : A → B → C
F : B → C

﻿
		 */
	}

}