package com.javaex;

public class Problem01 {

	public static void main(String[] args) {
		
		System.out.println("1에서 100까지 수에서 5의 배수 이면서 7의 배수인 값을 출력하시오");
		
		for (int i = 1; i < 101; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
