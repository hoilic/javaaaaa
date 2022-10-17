package salary.service_220930;

import java.util.ArrayList;

import salary.bean_220930.SalaryDTO;

public class SalaryPrint implements Salary  {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		System.out.println("번호\t이름\t직급\t기본급\t수당\t세율\t월급");
		
		for(SalaryDTO salaryDTO : list) {
			System.out.println(salaryDTO.toString());
			//.toString() 생략 가능  : 주소값을 가져온다
		
		}
		
	}

}
