package multifor_220920;

public class MultiFor01 {

	public static void main(String[] args) {
		for (int i=2; i<=4; i+=2 ) { // i+=2 는 i=i+2
			for (int j=1; j<=3; j++) {
				System.out.println("i = " + i + "  j = " + j);
			} //for j
			System.out.println();
		} //for i

	}

}
