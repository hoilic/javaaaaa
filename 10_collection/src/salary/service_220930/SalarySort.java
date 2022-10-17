package salary.service_220930;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalarySort implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("********************");
			System.out.println("     1. 이름으로 오름차순");
			System.out.println("     2. 월급으로 내림차순");
			System.out.println("     3. 이전메뉴");
			System.out.println("********************");
			System.out.println("     번호 : ");
			num = scan.nextInt();
			if(num == 3) break;
			
			else if(num ==1) {
			System.out.println("이름으로 오름차순");
			System.out.println();
			Collections.sort(list); //Collections 
			System.out.println("정렬 후 = ");
			for(SalaryDTO salaryDTO : list) {
				System.out.println(salaryDTO);
			}
			
			}//1
			else if (num ==2){
				Comparator<SalaryDTO> com = null;
				com = new Comparator<SalaryDTO>() {
					@Override
					public int compare(SalaryDTO s1, SalaryDTO s2) {
						return s1.getSalary()<s2.getSalary()?1: -1; //내림차순
						}			
				};
				Collections.sort(list, com);
				System.out.println("월급 내림차순 정렬완료");
				
			}
	
		
	}

}
}
