package com.javaex;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		int [] pocket = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력 받아 가장 큰 수를 출력하겠습니다.");
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<5; i++) {
			pocket[i] = sc.nextInt();
			sc.nextLine();
			if(pocket[i]>max) {
				max = pocket[i];
			}
		}
		
		System.out.println("가장 큰 정수는 = " +max);
		
	}
	
	
}
