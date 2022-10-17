package collection3_220930;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0
		System.out.println("벡터 용량 = " + v.capacity()); //Vector 의 기본 용량은 10 이다. 10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + " ");
			System.out.print(v.get(i-1) + "  "); //index 는 0부터 시작
		}//for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity()); //10
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + " "); //중복 허용
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity()); //10
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("마지막 항목 삭제");
//		v.remove("5"); - 앞에 있는"5"가 삭제
		v.remove(10);
		System.out.println();
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"  ");
			
		Iterator it = v.iterator(); //생성 - 메소드 사용
		while(it.hasNext()) {
			/*
			 * it.hasNext() - 항목이 있으면 true, 없으면 false		
			 * it.next() - 항목을 꺼내서 버퍼에 저장하고 다음 위치로 이동	 
			 */
			System.out.println(it.next() + "  ");	
		}//while
		System.out.println();
	
			
		}

	}

}
