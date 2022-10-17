package class_220922;

public class SungJukMain2 {

	public static void main(String[] args) {
		/*
		int a=10;
		int b=20;
		int c=30;
		
		int[] ar = new int[3]; // 여기서 new 는 클래스를 만드는거다
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		*/
		//----------
		
		SungJuk aa = new SungJuk();
		SungJuk bb = new SungJuk();
		SungJuk cc = new SungJuk();
		
		SungJuk[] ar= new SungJuk[3]; //객체 배열
		//여기서 new 는 성적이 들어갈 방을 만들어라
		
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("홍길동", 90,100,90); //호출
		ar[1].setData("프로도", 100,90,80); //호출
		ar[2].setData("죠르디", 88,70,95); //호출
		
	
		
		for(int i=0; i<ar.length; i++ ) {
			ar[i].calc();
			System.out.println(
					ar[i].getName()+"\t" + 
					ar[i].getKor()+"\t"+ 
					ar[i].getEng()+"\t"+
					ar[i].getMath()+"\t"+
					ar[i].getTot()+"\t"+
					ar[i].getAvg()+"\t"+ 
					ar[i].getGrade());
		}//for i
		System.out.println();
		
		for(SungJuk s : ar) { // for 문 SungJuk 클래스에 객체 s 를 만들고, ar 객체배열에 값을 순서대로 호출 
			s.calc();
			System.out.println(
					s.getName()+"\t" + 
					s.getKor()+"\t"+ 
					s.getEng()+"\t"+
					s.getMath()+"\t"+
					s.getTot()+"\t"+
					s.getAvg()+"\t"+ 
					s.getGrade());
		}
	

	}

}
