package operator_220916;

public class Operator05 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10) < 0 && (num2+=10) >0 );
		//num1 이 10 이 되고 false 로 된후 다음 조건으로 안넘어 간다.
		
		System.out.println("result = " + result); //false
		System.out.println("num1 = " + num1 + " num2 = " + num2); // 10 0
		System.out.println();
		
		result = ( (num1 += 10) > 0 || (num2 += 10) > 0 );
		
		System.out.println("result = " + result); //true
		System.out.println("num1 = " + num1 + " num2 = " + num2); // 20 0 
		
	}

}
