package nested_220930;

public class Outer {
	private String name; // 상속개념이 아니다
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + this.name + "\t 나이 = " + in.age);
		
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name); //상위 클래스 name 에 접근이 허용된것, 상속은 아니다
			System.out.println("나이 = " + this.age);
		}
		
	}//class Inner

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		ou.output();
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		
		//in.3name = "코난"; - error stati 으로 나왔기에 접근불가
		System.out.println();
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 35;
		//in4.name = 코난; -  error 
		in4.disp();
		
		

	}

}//class Outer
