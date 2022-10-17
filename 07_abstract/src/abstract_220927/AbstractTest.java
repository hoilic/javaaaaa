package abstract_220927;

public abstract class AbstractTest {//POJO 형식 (plain Old Java Object) 순수한 자바 클래스
//	protected String name; //캡슐화 , protected 는 자식에게 헝용한다는 의미
	String name; // default 시키면 (앞에 아무것도 안쓰면) 같은 package 안에 있는것들은 접근허용이 된다.

	public String getName() { //구현부 // 메소드 문을 열어 return 을 한다.
		return name;
	}

	public abstract void setName(String name); //추상메소드 = 가상메소드

}
