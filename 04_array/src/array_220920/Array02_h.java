package array_220920;

public class Array02_h {

	public static void main(String[] args) {
		String [] ar= {"사과", "바나나", "파인애플", "자몽","배", "자몽", "천도복숭아", "샤인머스켓"};
		String a = "aaaa";
		System.out.println(a.length()); // **.length() 는 문자열 크기를 알아볼수있따!
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" +i+"] = " + ar[i]);
			System.out.println("문자열의 크기 = " + ar[i].length()); //
			System.out.println("첫번째 문자 = " + ar[i].charAt(0));
			System.out.println("마지막 문자 = " + ar[i].charAt(ar[i].length()-1));
			
			System.out.println();
			
		
			}
		System.out.println("확장 for 문");
		for(String aa : ar) {
			System.out.print(aa + " ");
		}

	}

}
