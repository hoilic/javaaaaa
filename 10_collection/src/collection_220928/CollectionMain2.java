package collection_220928;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>(); // <> Generic 받는 타입을 표시
		// object 타입으로하는 객체 list의 ArrayList 선언
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");//중복허용 , 순서대로 잡힘
		list.add(25);//정수
		list.add(50.75);//실수
		list.add("기린");
		list.add("코끼리");
		// ArrayList 값을 추가하기 위해서는 add() 메소드를 사용
		
		for(int i=0; i<list.size(); i++) {//ArrayList 를 쓸때는 배열에 length 처럼 size 를 써라
			// list.size() : ArrayList의 크기
			System.out.println(list.get(i));
		}//for
		
		System.out.println();
		for(Object data : list) { //확장 for 문 list 의 data 출력
			System.out.println(data);
		}
		System.out.println("----------");
		System.out.println("ArrayList list 의 크기 : " + list.size());
	}

}
