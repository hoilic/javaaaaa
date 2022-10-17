package operator_220916;

public class Operator04 {

	public static void main(String[] args) {
		int a = 5;
		a += 2; // a = a + 2
		a *= 3; // a = a * 3
		System.out.println("a = " + a); // a = 21
		
		a++;
		System.out.println("a = " + a); // a = 22
		
		int b = a++;
		System.out.println("a = " + a + " b = " + b); //a=22, b=23
		/*﻿
		int b = a++;
		1) int b = a;
		2) a++
		*/
		
		int c = ++a - b--; //c=2
		/*
		 1) ++a //24
		 2) int c = a - b //24-22
		 3) b-- //21
		 */
		System.out.println("a = " + a + " b = " + b + " c = " +c);
		
		System.out.println("a++ =" + a++); //24
		/*
		 1) a++ = a //24
		 2) a++ //25
		 */
		System.out.println("a = " + a); //25

	}

}
