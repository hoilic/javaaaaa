package collection2_220929;

class GenericTest<T>{
	private T a;
	
	public void setA(T a) {
		this.a =a;
	}
	public T getA() {
		return a;
	}
}
//---------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		//aa.setA(25); - error
		
		GenericTest<Integer> c = new GenericTest<Integer>(); // <int> 로 쓰면 안됩니다.
		c.setA(25);
		System.out.println("나이 = " + c.getA());
	}

}
