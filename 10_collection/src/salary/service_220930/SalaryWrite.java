package salary.service_220930;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalaryWrite implements Salary {
	
	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호 입력 : ");
		int num = scan.nextInt();

		
		for(SalaryDTO salaryDTO:list) {
			if(salaryDTO.getNum()== num) {
				System.out.println("중복되는 사원 번호 입니다. 다른 번호를 입력하세요");
				return;
			}
		}

		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("직급 입력 : ");
		String position = scan.next();
		System.out.print("기본급 입력 : ");
		int basepay = scan.nextInt();
		System.out.print("수당 입력 : ");
		int extrapay = scan.nextInt();
		
		SalaryDTO salaryDTO = new SalaryDTO(name, position, 
				num, basepay, extrapay);
		salaryDTO.calc();
		
		list.add(salaryDTO);
		System.out.println("입력되었습니다");
	}

	

}
