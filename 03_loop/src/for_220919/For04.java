package for_220919;
//대문자 (A~Z)를 100개 발생하여 출력하시오
public class For04 {

	public static void main(String[] args) {
		char ch ;
		/*
		int a = (int)(Math.random()*26+65);
				System.out.println((char)a); //65~90
		*/
		
		for(int i=1; i<=100; i++) {
			ch = (char)(Math.random()*26 +65); //65~90;
			System.out.print(ch+ " ");		
	
		
	}
	}
}

