package while_220920;

public class While01 {

	public static void main(String[] args) {
		int a =1;
		while(a<=10) {
			System.out.print(a + "  ");
			a++;// 출력후 a 에 1을 더한다
		} //while
		System.out.println();
		
		
		int b=0;
		while(b<=9) {
			b++; // 0 인 b에 1을 더한후 출력
			System.out.print(b + "  ");
			
		} //while
		System.out.println();
		
		int c=0;
		while(true) { //while(true) 는 무한루프 입니다.
			c++; // 0 인 c에 1을 더한후 출력
			System.out.print(c + "  ");
			if(c == 10) break; //while 를 벗어나라			
		} //while
		
		

	}

}
