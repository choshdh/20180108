package com.javaex;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		
		System.out.println("숫자 입력받아서 계단식 출력하기");
		
		Scanner sc = new Scanner(System.in);
		
		int get = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=get; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
}
