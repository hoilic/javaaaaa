package variable_220915;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		boolean a;
		a = false; //대입문
		System.out.println("a = " + a);
		
		char b = 'A';
		System.out.println("b = " + b);
		
		char c = 65; 
		System.out.println("c = " + c);
		char d = 70; 
		System.out.println("c = " + d);
		
		/*
		char c = 65536; // char 는 65535 까지 인식 가능, 넘어가면 int 형으로 인식
		System.out.println("c = " + c);
		*/
		
		// byte d = 128; - error ( cannot convert from int to byte)
		
		int e = 65;
		System.out.println("e = " + e); //65
		
		int f = 'A';
		System.out.println("f = " + f);
		
		long g = 65L; //65L 은 long형 상수
		
		// float h = 43.8; - error (Type mismatch: cannot convert from double to float) //43.8은 double형 상수
		float h = 43.8f; // 43.8f 는 float형 상수, 태어날때부터 float 형으로 태어남
		float h2 = (float)43.8; //강제형변환 (Cast연산), double형으로 태어난걸 float로 바꿔줌
		System.out.println("h = " + h);
		
	}

}