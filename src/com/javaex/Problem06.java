package com.javaex;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받은 수에 따라 홀수합 짝수합 구하기");
		System.out.println("숫자를 입력해주세요>>");
		
		int total = 0;
		int get = sc.nextInt();
		sc.nextLine();
		
		if(get%2 == 0) {
			for(int i=2; i<=get; i+=2) {
				total += i;
			}
		}else {
			for(int i=1; i<=get; i+=2) {
				total += i;
			}
		}
		
		System.out.println("총합은 : " + total);
	}
}
