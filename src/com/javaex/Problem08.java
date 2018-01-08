package com.javaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*"예금 선택후 금액을 입력하면 예금액이 합산됩니다."
		"출금 선택후 금액을 입력하면 예금액이 차감됩니다."
		"잔고 선택시 현재 잔고가 출력됩니다."
		"종료 선택시 종료됩니다."
		"1,2,3,4 이외의 숫자 입력시 다시 입력해주세요 메시지 출력"*/
		
		long totalmoney=0;
		
		Scanner sc = new Scanner(System.in);
		
		menu : while(true) {
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			int select=0;
			try {
				select = sc.nextInt();
				sc.nextLine();
			
				long money = 0;
				switch(select) {
				case 1 :
					System.out.println("예금액을 입력해주세요.");
					money = sc.nextLong();
					sc.nextLine();
					totalmoney += money;
					System.out.println("정상 입금 되었습니다.");
					break;
				case 2 :
					System.out.println("출금액을 입력해주세요.");
					money =  sc.nextLong();
					sc.nextLine();
					if(totalmoney>money) {
						totalmoney -= money;
						System.out.println("정상 출금 되었습니다.");
					}else {
						System.out.println("예금액보다 출금액이 많아 출금 할 수 없습니다.");
					}
					break;
				case 3 :
					System.out.println("현재 잔고는 : " + totalmoney);
					break;
				case 4 : 
					System.out.println("종료 하겠습니다.");
					break menu;
				default:
					System.out.println("1~4 까지의 숫자만 입력해주세요.");
				}
				
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				sc.nextLine();
				System.out.println("숫자만 입력해주세요");
			}
			
		}
		
		System.out.println("프로그램이 안전하게 종료되었습니다.");
		
	}

}
