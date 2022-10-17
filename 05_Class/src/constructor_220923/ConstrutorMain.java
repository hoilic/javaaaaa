package constructor_220923;

class Hello{
	private String name;
	private int age;
	
	public Hello() {
		System.out.println("기본 생성자");
	}
	public Hello(String name) {
		this.name = name;
	}
	public Hello(int age) {
		this(); //Overload된 다른 생성자를 호출 할 수 있다.
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}


//----------

public class ConstrutorMain {

	public static void main(String[] args) {
		Hello aa = new Hello();
		System.out.println(aa.getName()+"\t"+aa.getAge());
		System.out.println();
		
		Hello bb = new Hello("홍길동");
		System.out.println(bb.getName()+"\t"+bb.getAge());
		System.out.println();
		
		Hello cc = new Hello(25);
		System.out.println(cc.getName()+"\t"+cc.getAge());
		System.out.println();


	}

}
