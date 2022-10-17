package class_220922;

public class SungJukMain {

	public static void main(String[] args) {
		
		
		SungJuk aa = new SungJuk();
		
		aa.setData("홍길동", 90,100,90); //호출
		aa.calc();
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점\t"  );
		System.out.println("--------------------------------------------------");
		System.out.println(
				aa.getName()+"\t" + 
				aa.getKor()+"\t"+ 
				aa.getEng()+"\t"+
				aa.getMath()+"\t"+
				aa.getTot()+"\t"+
//				String.format("%.2f",aa.getAvg())
		 		aa.getAvg()+"\t"+ 
				aa.getGrade());
		//----------------------
		SungJuk bb = new SungJuk();
		bb.setData ("프로도", 100, 89, 75);	
		bb.calc();
	
		System.out.println(
				bb.getName()+"\t" + 
				bb.getKor()+"\t"+ 
				bb.getEng()+"\t"+
				bb.getMath()+"\t"+
				bb.getTot()+"\t"+
//				String.format("%.2f",aa.getAvg())
		 		bb.getAvg()+"\t"+ 
				bb.getGrade());
		//----------
		SungJuk cc = new SungJuk();
		cc.setData ("죠르디", 75, 80, 72);	
		cc.calc();
	
		System.out.println(
				cc.getName()+"\t" + 
				cc.getKor()+"\t"+ 
				cc.getEng()+"\t"+
				cc.getMath()+"\t"+
				cc.getTot()+"\t"+
//				String.format("%.2f",aa.getAvg())
		 		cc.getAvg()+"\t"+ 
				cc.getGrade());
	}

}
/*
[문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
      getName()
      getKor()
      getEng()
      getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100

 */