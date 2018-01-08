package com.javaex;

public class Problem04 {
	
	public static void main(String[] args) {
		
		System.out.println("밀어내기 숫자 출력");
		
		int count = 10;
		for(int i=1; i<=count; i++) {
			for(int j=i; j<count+i; j++) {
				System.out.printf("%2d  ",j);
			}
			System.out.println();
		}
	}

}
