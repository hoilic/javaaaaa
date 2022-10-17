package variable_220915;

public class Variable02 {
	static int a; //(전역변수) 필드, 초기화 되어 있다.
	int b; //필드, new를 붙여서 instance 생성
	
	public static void main(String[] args) {
		int a = 5; //local variable (지역변수), 반드시 초기화 해야 한다.
		//int a; 같은 지역에 동일한 변수가 올수 없다
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 a = " + Variable02.a);
		//System.out.println("필드 b = " + Variable02.b); 
		//static 이 아니면 사용 못한다. 새로 생성해야한다.
		System.out.println("필드 b = " + new Variable02().b);
	}

}