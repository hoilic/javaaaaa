package for_220919;
//대문자 (A~Z)를 100개 발생하여 출력하시오
//1줄에 10개씩 출력하시오
//100개중 A가 몇개 나왔는지 개수를 출력
public class For04_01 {

	public static void main(String[] args) {
		char ch ;
		int count = 0;
		/*
		int a = (int)(Math.random()*26+65);
				System.out.println((char)a); //65~90
		*/
		
		for(int i=1; i<=100; i++) {
			ch = (char)(Math.random()*26 +65); //65~90;
			System.out.print(ch+ " ");
			
			if(i%10 == 0) System.out.println();
			if(ch == 'A') count++;
			}
		System.out.println();
		System.out.println("A의 개수 = " + count);

		}
	
}

