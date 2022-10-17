package method_220922;

public class Method02 {
	
	public void disp() {//구현 //disp 라는 메소드 구현
		System.out.println("non-static method");
	}
	
	public static void output() {//구현 
		/*static 은 객체를 생성 안해도 쓸수 있다.
		 그러나 메모리를 많이 차지하기때문에 권장하지 않는다.	 
		 */
		System.out.println("static method");				
	}

	public static void main(String[] args) {
		Method02.output(); //호출
		output();// Method02 안에 있는 메소드이기에 output 만 써도 된다.
		
		//disp(); //static 이 아니기때문에 new 생성해야한다.
		Method02 m = new Method02();
		m.disp(); // disp 메소드 호출
	}

}
