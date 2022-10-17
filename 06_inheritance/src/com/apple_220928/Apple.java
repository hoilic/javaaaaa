package com.apple_220928;

import com.zoo_220928.Zoo;

public class Apple {


	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo 클래스의 tiger() 호출	
		Zoo zoo = new Zoo();
		zoo.tiger();
//		zoo.giraffe();
//		zoo.elephant();
//		zoo.lion();
		//public 만 같은 package 에서 접근허용
		
	}

}
