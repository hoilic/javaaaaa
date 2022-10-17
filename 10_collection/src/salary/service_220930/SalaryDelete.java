package salary.service_220930;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalaryDelete implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 사원번호 입력 : ");
		int num = scan.nextInt();
		int sw=0;
		Iterator<SalaryDTO> it = list.iterator();
		while (it.hasNext()) {
			if(it.next().getNum()==num){
				it.remove();
				sw=1;
				System.out.println("삭제 완료되었습니다");
				break;
			}//if
		}//while
		if(sw==0) System.out.println("해당 번호의 사원이 존재하지 않습니다");
	}

}
