package SungJuk_220929;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 이름 입력 : ");
		String name = scan.next();
		
		/* 찬영님
		int count=0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				i--;
				count++;
			}//if			
		}//for
		*/
		int count=0;
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next(); 
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); 
				//it.remove()는 반드시 it.next()가 반환하는 항목을 지운다.
				count++;
			}
		}//while
		
		if(count == 0)
			System.out.println("삭제할 이름이 없습니다");
		else
			System.out.println("모든 데이터 삭제했습니다");

	}

}

/* 이름은 중복이 되어있다 => 똑같은 이름이 2개 이상 이라면 다 지우세요
 * 삭제 할 이름을 입력 : 홍길동
 * 삭제 할 이름이 없습니다.
 * 
 * 또는
 * 
 * 삭제 할 이름을 입력 : 홍길동
 * 모든 데이터 삭제 했습니다.
 */
