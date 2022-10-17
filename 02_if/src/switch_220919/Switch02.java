package switch_220919;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 = ");
		int a = scan.nextInt();
		System.out.print("b의 값 = ");
		int b = scan.nextInt();
		System.out.print("연산자 (+,-,*,/)를 입력 : ");
		String op = scan.next();
		
		switch(op) {
		case "+"  : System.out.println(a + "+" + b + "=" + (a+b)); break;
		case "-"  : System.out.println(a + "-" + b + "=" + (a-b)); break;
		case "*"  : System.out.println(a + "*" + b + "=" + (a*b)); break;
		case "/"  : System.out.println(a + "/" + b + "=" + ((double)a/b)); break;
		default : System.out.println("연산자 error");		
		}//switch - 가독성
		
		

	}

}
