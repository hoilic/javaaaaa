package inheritance_220926;

public class Child extends Super {
	protected String name;
	protected int age;

	public Child() {//기본생성자
		System.out.println("Sub 기본생성자");	
	}
	public Child(String name, int age, double weight, double height) {
		// 생성자는 클래스에 대한 설명,
		
		super( ); //부모클래스의 생성자를 호출할수 있다. 첫째 줄에서만 가능하다.
		
		System.out.println("Child 일반 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight; //이거는 부모꺼에요 =  this.weight = weight
		super.height = height; //이거는 부모꺼에요 =  this.height = height
	}
	
	public void disp(){
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	public static void main(String[] args) {
		Child aa= new Child("홍길동", 25, 70.5, 182.3);
		aa.disp();
		System.out.println();//줄바꿈
		
		System.out.println("---------------");
		
		Super bb = new Child("코난", 13, 35.6, 152.7);
		//bb.output(); - error 부모이기에 못부름
		bb.disp();
	}
}
