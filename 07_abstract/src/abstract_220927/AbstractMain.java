package abstract_220927;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		AbstractTest at = new AbstractMain(); //AbstractTest => AbstractMain
		/*추상클래스는 절대 new 할수 없다
		 ﻿추상클래스는 자신의 클래스로 메모리 생성을 할 수 없다 => 생성하려면 
		 가. Sub Class를 이용(반드시 Sub Class가 추상메소드를 Override 해야 한다) 
		 나. 메소드를 이용
		 */

	}

}
