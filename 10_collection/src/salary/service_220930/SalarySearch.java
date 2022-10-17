package salary.service_220930;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalarySearch implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.next();
		
		int sw=0;
		for(SalaryDTO salaryDTO : list) {
			if(salaryDTO.getName().equals(name)) {
				System.out.println();								
				System.out.println("번호\t이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(salaryDTO);
				sw=1;
			}			
	}
		if(sw==0) System.out.println("해당 이름의 사원이 존재하지 않습니다");

}
}
