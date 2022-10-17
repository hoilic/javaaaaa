package salary.main_220930;

import salary.service_220930.SalaryService;

public class SalaryMain {

	public static void main(String[] args) {
		SalaryService salaryService = new SalaryService();
		salaryService.menu();
		System.out.println("프로그램을 종료합니다.");	
	}
}
