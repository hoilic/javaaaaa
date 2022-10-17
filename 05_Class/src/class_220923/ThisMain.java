package class_220923;

class This{
	private int a; // 외부에서 접근 안됨
	//public int a; // 다른 클래스 에서 접근 가능
	
	public void setA(int a) { //void 는 return 값이 없다 라는 뜻
		System.out.println("this = " + this); // 여기서 this 는 클래스 this 를 의미
		this.a= a; // this.a 는 클래스 필드 값 a 를 의미
	}
	public int getA() {
		return a; //필드 a, this가 생략
	}
	
	
}
//--------------------

public class ThisMain {

	public static void main(String[] args) {
		This t= new This(); //This 클래스에 객체t를 생성
		System.out.println("객체 t = " + t);
		t.setA(10);
		System.out.println(t.getA());
		
		This s = new This();
		System.out.println("객체 s = " + s);
		s.setA(20);
		System.out.println(s.getA());
		

	}

}
