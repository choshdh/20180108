package com.javaex;

public class Problem03 {

	public static void main(String[] args) {
		
		System.out.println("구구단");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++){
				System.out.printf("%d * %d =%2d | ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
