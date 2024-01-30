package com.javaex.ex01;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		boolean run2=true;
		boolean run3=true;
		
		while(run) {
		
		System.out.println("****************************************");
		System.out.println("***************환영합니다***************");
		System.out.println();
		System.out.println("1. 로그인"+"\t"+"2.회원가입"+"\t"+"3.종료");
		System.out.println("----------------------------------------");
		System.out.print(">>");
		int a=sc.nextInt();
		if(a==1) {
			while(run2) {
				System.out.println();
				System.out.println();
				
				System.out.println("--------------로그인---------------");
				System.out.println("돌아가기는 아이디 0, 패스워드0을");
				System.out.println("입력해주세요");
				System.out.print(">아이디:");
				String str=sc.next();
				System.out.print(">패스워드:");
				
				
				//입력한 아이디와 패스워드가 db에 있으면 로그인
				//없으면 반복
				
				
				
				
				
				String str2=sc.next();
				if(str.equals("0")&&str2.equals("0")) {
					run2=false;
				}
				//두개다 공백 처리면 나가기
				
				
				
				
				
				System.out.println();
				System.out.println();
				System.out.println("로그인 되었습니다");
				while(true) {
					System.out.println("1.정보    "+"\t"+"2.근태현황"+"\t"+"로그아웃");
					System.out.println(">>");
					int b=sc.nextInt();
					if(b==1) {
						//정보창
						//개인 정보 리스트 출력
					
						System.out.println();
						System.out.println("1.정보수정"+"\t"+"2.나가기");
						System.out.println(">>");
						int c=sc.nextInt();
						if(c==1) {
						
							//정보 수정창 생성
							//정보 수정내용 db에 저장하기
						
							//마지막에 탈출
							
						
						}else if(c==2) {
							break;
						}else {
							System.out.println("다시 입력해주세요");
							System.out.println();
							System.out.println();
						}
					
					}else if(b==2) {
					
						//근태현황창
						//근태현황 리스트 출력
					
						System.out.println();
						System.out.println("1.근태수정"+"\t"+"2.나가기");
						System.out.println(">>");
						int c=sc.nextInt();
						if(c==1) {
							
							//근태 수정창 생성
							//근태 수정 내용 db에 저장하기
							
							//마지막에 탈출
							
						
					}else if(c==2) {
						break;
					}else {
						System.out.println("다시 입력해주세요");
						System.out.println();
						System.out.println();
					}
					
					
				}else if(a==3) {
					System.out.println("로그아웃 되었습니다");
					break;
				}else {
					System.out.println("다시 입력해주세요");
					System.out.println();
					System.out.println();
				}
			}
			}
		}else if(a==2) {
			
			//회원가입창
			//입력한 내용 db에 저장
			//입력이 안되면 다시 입력 시켜야함
			
			
		}else if(a==3){
			run=false;
		}else {
			System.out.println("다시 입력해주세요");
			System.out.println();
			System.out.println();
		}
		
		
		}
		
		sc.close();

	}
}
