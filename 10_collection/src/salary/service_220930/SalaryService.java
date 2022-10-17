package salary.service_220930;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean_220930.SalaryDTO;

public class SalaryService {

	private ArrayList<SalaryDTO> list = new ArrayList<SalaryDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		Salary salary = null; 
		// 지역변수 이기 때문에 초기값을 설정하여 
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1. 등록 ");
			System.out.println("   2. 출력 ");
			System.out.println("   3. 수정 ");
			System.out.println("   4. 검색 ");
			System.out.println("   5. 삭제 ");
			System.out.println("   6. 정렬 ");
			System.out.println("   7. 종료 ");
			System.out.println("***************");
			System.out.print("   번호 :  ");
			num = scan.nextInt();
			if(num == 7) break;
			
			if(num == 1) {
				salary = new SalaryWrite();	
			}
			else if(num == 2) {
				salary = new SalaryPrint();				
			}
			else if(num == 3) {
				salary = new SalaryUpdate();			
			}
			else if(num == 4) {
				salary = new SalarySearch();			
			}
			else if(num == 5) {
				salary = new SalaryDelete();				
			}
			else if(num == 6) {
				salary = new SalarySort();				
			}
			else {
				System.out.println("1~7중에 선택하세요");
				continue;
			}
			salary.execute(list);//호출
		}
		
	}

}
