package class2_220927;

import java.util.Scanner;

public class StringBufferMain {
	private int dan; // class 안에서 적용되는 int 형 변수 dan 생성
	
	public void input() { //input 메소드 구현
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		this.dan = scan.nextInt();
		//this.dan은 필드에 있는 int dan 과 같다는 의미이고, this가생략 가능하다
	}
	
	public void output() { //output 메소드 구현
		StringBuffer buffer = new StringBuffer();
		//클래스 생성
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + " * " + i + "=" + dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); //StringBuffer => String으로 변환해서 출력
			buffer.delete(0, buffer.length()); 
		}
	}

	public static void main(String[] args) {
		StringBufferMain stringBufferMain = new StringBufferMain(); 
		// 객체 잡고 클래스 생성+생성자 , ()안에 아무값도 없으면 default 생성
		stringBufferMain.input();
		stringBufferMain.output();
		
		
	}

}

/*
원하는 단을 입력 : 5     input()
------------------------------
5*1=5              output()




5*9=5 
*/