package class2_220927;

class StaticTest{
	private int a; //필드, 인스턴스 변수 //개인화장실
	private static int b; //필드, 클래스 변수 //공중화장실 공유값을 구할때는 static 로 써야함. 누적할때 사용
			//static 은 void main 이 되어야 부를수 있다.
	static { //static 변수 초기화
		System.out.println("초기화 영역");
		b = 1;
	}
	
	public StaticTest() { //생성자
		System.out.println("기본 생성자");
		this.a = 1;
	}
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a=" +this.a+"\t b="+b);
	}
	public static void output() {
		System.out.println("Static method...");
//		System.out.println("a=" +a+"\t b="+b);
		//static 메소드 안에서는 this 가 없으므로 static 변수만 사용 가능하다.
	}
}


//--------------------
public class StaticMain {

	public static void main(String[] args) {
		StaticTest st = new StaticTest(); //객체 생성과 동시에 생성자 호출
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output(); //클래스명.메소드()
		st.output();//객체.메소드()

	}

}
