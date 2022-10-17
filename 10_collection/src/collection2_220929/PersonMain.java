package collection2_220929;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() { //지역변수
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);
		
//		System.out.println("이름 = " + aa.getName() + " 나이 = " + aa.getAge());
//		System.out.println("이름 = " + bb.getName() + " 나이 = " + bb.getAge());
//		System.out.println("이름 = " + cc.getName() + " 나이 = " + cc.getAge());
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>(); // 객체를 담아주는 용도
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list; //return 은 void 안됨

	}//init

	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();
		for(PersonDTO personDTO : list ) {
			System.out.println(personDTO); //주소값
		}
		
	}//main

}
