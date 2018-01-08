package com.javaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int get = 0;
		game : while(true) {
			System.out.println("1에서 100사이 랜덤값으로 초기화 되었습니다.");
			System.out.println("숫자를 맞춰주세요.");
			int random = (int) (Math.random()*100 +1);
			while(true){
				try {
					get = sc.nextInt();
					sc.nextLine();
					if(random<get) {
						System.out.println("더 낮은 숫자입니다.");
					}else if(random>get) {
						System.out.println("더 높은 숫자입니다.");
					}else if(random==get){
						System.out.println("정답 입니다.");
						System.out.println("게임을 계속 하시겠습니까? y/n");
						String exit = sc.nextLine();
						if(exit.equals("y")){
							break game;
						}else{
							break;
						}
					}
				}catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요");
					continue;
				}
			}
		}
		
		System.out.println("게임을 종료합니다.");
		
	}
}
