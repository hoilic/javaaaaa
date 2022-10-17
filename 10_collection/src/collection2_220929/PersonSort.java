package collection2_220929;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple","banana","pear","peach","applrmango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data + "   ");
		}
		System.out.println();
		
		Arrays.sort(ar); //배열 안에 있는 애들을 오름차순 으로 정렬
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data + "   ");
		}
		System.out.println();
		System.out.println("--------------------");
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);
		PersonDTO dd = new PersonDTO("스누피", 75);
		PersonDTO ee = new PersonDTO("손오공", 10);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		list.add(dd);
		list.add(ee);
		
		
		System.out.println("정렬 전 = ");
		for(PersonDTO personDTO : list ) {
			System.out.println(personDTO); //주소값
		}
		
		System.out.println("나이로 오름차순");
		System.out.println();
		Collections.sort(list); //Collections 
		System.out.println("정렬 후 = ");
		for(PersonDTO personDTO : list ) {
			System.out.println(personDTO); //주소값
		}
		System.out.println();
		System.out.println("이름으로 내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {//익명 Inner Class
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName())* -1;
			}
		};
		
		Collections.sort(list, com);
		
		System.out.println("정렬 후 = ");
		for(PersonDTO personDTO : list ) {
			System.out.println(personDTO); //주소값
		}
		System.out.println();
		
		

	}

}
