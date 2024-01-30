package com.javaex.ex01;

import java.util.Scanner;

public class manager {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {		//종료 설정 없음
			System.out.println("-------------");
			System.out.println("관리자님 환영합니다");
			System.out.println("-------------");
			System.out.println("      목록      ");
			System.out.println("1. 직원리스트");
			System.out.println("2. 부서리스트");
			System.out.print(">>");
			int a=sc.nextInt();
			if(a==1) {
				//직원 리스트 출력
				
				while(true) {
					System.out.println("1. 리스트 수정");
					System.out.println("2. 나가기");
					System.out.print(">>");
					int b=sc.nextInt();
					if(b==1) {
						//리스트 수정 진행
						
						
						
					}else if(b==2) {
						break;
					}else {
						System.out.println("잘못 입력하셨습니다");
					}
				
				}
			}else if(a==2) {
				//부서 리스트 출력
				while(true) {
					System.out.println("1. 리스트 수정");
					System.out.println("2. 나가기");
					System.out.print(">>");
					int b=sc.nextInt();
					if(b==1) {
						//리스트 수정 진행
						
						
					}else if(b==2) {
						break;
					}else {
						System.out.println("잘못 입력하셨습니다");
					}
				}
			}else {
				System.out.println("목록에 없는 번호입니다");
			}
			
			
			
		}
	
	}
}
