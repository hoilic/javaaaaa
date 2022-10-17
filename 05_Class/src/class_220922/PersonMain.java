package class_220922;

class Person{ // person 클래스는 접근자가 없다 즉, dafault이다. 같은 패키지 안에서 사용
	private String name; //필드, 초기화, null 
	//private 는 person class 에서만 쓸수있다. 그래서 우회해서 getter setter 를 사용한다.
	
	private int age; //필드, 초기화, 0
	//String 의 초기값은 null 이고, int(수와관련된 )의 초기값은 0
	
	public String getName(){ //public 은 접근제어자로 package 안 밖에서 다 사용가능
		return name;
		//return 은 메인에서 입력받은 값을 다시 돌려줄거라는 의미
	}
	public int getAge(){
		return age;
	}
	
	//void 는 return값이 아무것도 없을때 사용한다. 거의 setter 일때 사용한다.
	public void setName(String n) { //구현
		name = n;
		//입력을 받겠다 
	}
	public void setAge(int k) { //구현
		age = k;
	}
	public void setData(String n, int k) { //구현
		name = n;
		age = k;
	}
	public void setData() { //overload
		
	}
}
//----------
public class PersonMain {

	public static void main(String[] args) {
		/*int aa; //정수형 변수
		double bb; //실수형 변수
		*/
		
		Person aa; //클래스형 변수, 객체  //Person 이라는 클래스의 aa 객체 생성
		aa= new Person(); //메모리 생성
		System.out.println("객체 aa = " + aa);
		
		aa.setName("홍길동"); // aa라는 Person 클래스에 setname 에 홍길동을 입력해라
		aa.setAge (25);
		System.out.println("이름 = " + aa.getName() + "\t 나이 = " + aa.getAge());
		
		System.out.println();
		
		Person bb = new Person();
		System.out.println("객체 dd = " + bb);
		bb.setName("코난");
		bb.setAge (13);
		System.out.println("이름 = " + bb.getName() + "\t 나이 = " + bb.getAge());
		
		System.out.println();
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("둘리", 100);
		System.out.println("이름 = " + cc.getName() + "\t 나이 = " + cc.getAge());
		
		System.out.println();
		
		Person dd = new Person();
		System.out.println("객체 dd = " + dd);
		dd.setData();
		System.out.println("이름 = " + dd.getName() + "\t 나이 = " + dd.getAge());
	}

}
