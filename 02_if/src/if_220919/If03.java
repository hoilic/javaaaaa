package if_220919;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 = ");
		int a = scan.nextInt();
		System.out.print("b의 값 = ");
		int b = scan.nextInt();
		System.out.print("c의 값 = ");
		int c = scan.nextInt();
		
		if(a>b && a>c) {
			if(b>c) System.out.println(a+ "\t"+ b +"\t"+ c );
			else System.out.println(a +"\t"+ c +"\t"+ b);
		}
		else if(b>c && b>a) {
			if(a>c) System.out.println(b+ "\t"+ a +"\t" +c );
			else System.out.println(b +"\t"+ c +"\t" +a);
		}
		else if(c>a && c>b) {
			if(a>b) System.out.println(c+"\t"+ a +"\t" +b );
			else System.out.println(c +"\t" +b +"\t"+ a);
	}
	}
}
