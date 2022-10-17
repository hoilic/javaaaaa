package class_220923;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Compute[] aa = new Compute[3]; //객체배열 생성, 결합도 1:1관계
		
		
		
		for(int i=0; i<3; i++) {
			aa[i] = new Compute();//Comput 라는 객체를 aa[i] 에 넣어준다
			System.out.print("X 입력 : ");
			int x = scan.nextInt();
			aa[i].setX(x); // aa[i] 배열이 setX메소드에 x 값을 입력
			
			
			System.out.print("Y 입력 : ");
			int y = scan.nextInt();
			aa[i].setY(y);
			}//for i
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for(int j=0; j<3; j++) {
			aa[j].calc();
			System.out.println(
					aa[j].getX()+"\t" + 
					aa[j].getY()+"\t"+ 
					aa[j].getSum()+"\t"+
					aa[j].getSub()+"\t"+
					aa[j].getMul()+"\t"+
					String.format("%.2f",aa[j].getDiv())+"\t");
		}
		

	}

}
