package while_220920;

public class DoWhile01 {

	public static void main(String[] args) {
		// A B C D E ~~~ X Y Z
				// 1줄에 7개씩 출력하시오
				char ch = 'A'; // 'A'는 65
				int count = 0;
				do {
					System.out.print(ch + " ");
					ch++;
					
					count++;
					if(count%7 ==0) System.out.println(); //ch-65 는 'A'의 값이 65이므로 나머지 0을 만들어주기위해
				}while(ch <= 'Z');
				
//				while(ch <= 'Z'){
//					System.out.print(ch + " ");
//					ch++;
//					
//					count++;
//					if(count%7 ==0) System.out.println();					
//				}

			}


	}

