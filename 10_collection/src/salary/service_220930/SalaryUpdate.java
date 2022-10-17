package salary.service_220930;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalaryUpdate implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		
		int sw=0;
		for(SalaryDTO salaryDTO : list) {
			if(salaryDTO.getNum() == num) {
				sw=1;
				
				System.out.println();
				
				System.out.print("수정 할 직급 입력 : ");
				String position = scan.next();
				System.out.print("수정 할 기본급 입력 : ");
				int basepay = scan.nextInt();
				System.out.print("수정 할 수당 입력 : ");
				int extrapay = scan.nextInt();
				
				
				salaryDTO.setPosition(position);
				salaryDTO.setBasepay(basepay);
				salaryDTO.setExtrapay(extrapay);
				
				salaryDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;
			}//if		
		}//for
		if(sw == 0)System.out.println("잘못된 번호 입니다.");
	}

}
