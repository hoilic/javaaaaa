package if_220919;

import java.util.Scanner;

//강사님 문제풀이
public class If03_01 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 = ");
		int a = scan.nextInt();
		System.out.print("b의 값 = ");
		int b = scan.nextInt();
		System.out.print("c의 값 = ");
		int c = scan.nextInt();
		
		
		if(a<c && b<c) { //c가 가장 큰경우
			if(a<b)System.out.println(c + "," + b + "," + a);
			else System.out.println(c + "," + a + "," + b);
			
		}else if (c<b && a<b) { //b가 가장 큰 경우
			if(c<a)System.out.println(b + "," + a + "," + c);
			else System.out.println(b + "," + c + "," + a);
			
		}else if(b<a && c<a) { //a가 가장 큰 경우
			if(b<c)System.out.println(a + "," + c + "," + b);
			else System.out.println(a + "," + b + "," + c);
			
		}
	}

}
