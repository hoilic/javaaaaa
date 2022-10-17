package collection_220928;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {
		Collection<Object> coll = new ArrayList<Object>(); // 부모 = 자식
		// Collection coll = interface 부모
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");//중복허용 , 순서대로 잡힘
		//coll.add(25);//정수
		//coll.add(50.75);//실수
		coll.add("기린");
		coll.add("코끼리");
		//Collection 은 클래스가 생성이 안됩니다.
		
		//coll.get(0); - error 자식클래스에 있어서 못부름
		
		Iterator<Object> it= coll.iterator(); //생성
		// Iterator 도 interface 라서 new 할수 없다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		1. it.hasNext() - 현재 위치에 항목이 있는 참, 없으면 거짓
//		2. it.next() - 현재 위치에 항목을 꺼내서 저장하고 다음 위치로 이동
		

	}

}
