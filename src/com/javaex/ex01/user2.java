package com.javaex.ex01;

import java.util.Scanner;

public class user2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {		//종료는 구현안함
			System.out.println("==========근태입력 프로그램==========");
			System.out.println();
			System.out.println();
			while(true) {
				System.out.println("===============================");
				System.out.println("==============로그인=============");
				System.out.println("아이디와 비밀번호가 없다면 0과0을 눌러주세요");
				System.out.println();
				System.out.print("아이디: ");
				String id=sc.next();
				System.out.print("비밀번호: ");
				String pw=sc.next();
			
				if(id.equals("0")&&pw.equals("0")){
					//만약 0과 0을 입력하면 회원가입창으로 이동
					//회원가입 완료되면 다시 반복문 시작
					break;
				}
				System.out.println();
				System.out.println();
			
				System.out.println();
				System.out.println();
				System.out.println("============환영합니다===========");
				System.out.println();
				while(true) {
					System.out.println("1.개인정보 2.개인정보수정 3.근태현황 4.휴가/병가신청 5.로그아웃");
					int a=sc.nextInt();
					if(a==1) {
						//개인정보 리스트 출력
						
					}else if(a==2) {
						//개인정보 수정출력
					
					}else if(a==3) {
						//근태현황 리스트 출력
					
					}else if(a==4) {
						//근태현황 리스트 출력
					
					}else if(a==5) {
						break;
					}else {
					
						System.out.println("잘못입력하셨습니다");
						System.out.println("다시입력해주세요");
					}
				
				}
			
			}
			sc.close();
		}
		
	
	}
}
