package inheritance_220926;


public class Sub extends Super {
	protected String name;
	protected int age;



	public Sub() {//기본생성자
		System.out.println("Sub 기본생성자");	
	}
	public Sub(String name, int age, double weight, double height) {
		System.out.println("Sub 일반 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight; //이거는 부모꺼에요 =  this.weight = weight
		super.height = height; //이거는 부모꺼에요 =  this.height = height
	}
	public void output(){
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	public static void main(String[] args) {
		Sub aa= new Sub("홍길동", 25, 70.5, 182.3);
		aa.disp();
		System.out.println();//줄바꿈
		aa.output();
		System.out.println("---------------");
		
		Super bb = new Sub("코난", 13, 35.6, 152.7);
		//bb.output(); - error 부모이기에 못부름
		bb.disp();
	
		
	}
}
