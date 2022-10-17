package multifor_220920;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan, i;
	
		
		for(dan= 2; dan<=9; dan++) { // i = 1~9
			for ( i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			} //for j
			
			System.out.println(); // 2단이 한바퀴 끝나고 줄 띄우기, 3단이 끝나고 줄 띄우기, ~~~
		}
			
	}

}
/*
2단  9단 구구단

2*1 = 2
2*2 = 4


*/