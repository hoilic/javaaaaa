package constructor_220923;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Exam me = new Exam();
		me.compare();
		
		System.out.println();
		System.out.println("이름\t1 2 3 4 5 \t점수");
		System.out.print(me.getName()+"\t");
		
		for(int i=0; i<me.getOx().length; i++) {
			System.out.print(me.getOx()[i] + " ");
		}
		System.out.println("\t" + me.getScore());
	}

}
