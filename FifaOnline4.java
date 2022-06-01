package com.nexon.fifa;

import java.util.Scanner;

/*
 * 아래의 시스템을 생성하시오.
 * 초기화면 : 1. 선수등록 2. 선수 리스트 3.선수 확인 4. 종료
 * 
 * 1) 선수 등록 화면 (최대 등록 갯수 5개)
 * 등록된 선수가 5명인 경우, 최대 멤버 초과입니다. 노출 후, 초기화면으로 돌아간다
 * 
 * 그렇지 않은 경우,
 * 
 * 선수 등록 시, (이름 , 카드 타입 , 민첩성 , 밸런스 , 몸싸움 , 스피드(속/가) ) 를 입력 받는다.
 * 하나라도 빈 공간이 있을 경우, 다시 입력해주세요 . 후, 해당 내용을 다시 입력받는다.
 * 선수 등록이 완료 된 경우, 초기화면으로 돌아간다.
 * 
 * 
 * 2) 선수 리스트 
 * 등록한 선수에 대한 이름을 노출 후, 초기화면으로 돌아간다.
 * 
 * 
 * 3) 선수 확인
 * 선수 이름을 입력받아, 등록한 선수의 이름과 일치한 경우,
 * 선수의 이름 , 카드 시즌 ,  OVR ( (민첩성 + 밸런스 + 몸싸움 + 스피드) / 4) 를 노출시킨 후, 초기화면으로 돌아간다.
 * 
 * 4. 종료
 * 시스템 종료
 * 
 * */
//배열의 길이 : 변수명.length
//각 배열에 값을 담는 법 : 변수명[인덱스] = 값
//변수 선언 하는법 String[] i = new String[배열의 길이]
// SoccerPlayer[] player = new SoccerPlayer[배열의 길이]


//* 1) 선수 등록 화면 (최대 등록 갯수 5개)
//* 등록된 선수가 5명인 경우, 최대 멤버 초과입니다. 노출 후, 초기화면으로 돌아간다
//* 
//* 그렇지 않은 경우,
//* 
//* 선수 등록 시, (이름 , 카드 타입 , 민첩성 , 밸런스 , 몸싸움 , 스피드(속/가) ) 를 입력 받는다.
//* 하나라도 빈 공간이 있을 경우, 다시 입력해주세요 . 후, 해당 내용을 다시 입력받는다.
//* 선수 등록이 완료 된 경우, 초기화면으로 돌아간다.
public class FifaOnline4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 배열 선언
		SoccerPlayer[] players = new SoccerPlayer[5];
		
		int selected = 0;
		
		while(selected != 4) {	// 4. 종료 될때까지 반복
			
			System.out.println("1. 선수등록 2. 선수 리스트 3.선수 확인 4. 종료");
			selected=scan.nextInt();
			
			if(selected == 1) {	// 선수등록인 경우,
				
				int nullCnt = 0;
				
				for(int i=0;i<players.length;i++) {
					if(players[i] == null ) {
						nullCnt ++;
					}
				}
				
				if(nullCnt == 0) {
					System.out.println("최대 멤버 초과입니다.");
				} else {
					System.out.println("이름을 입력하세요 . ");
					String name = scan.next();
					
					System.out.println("카드 타입을 입력하세요 . ");
					String type = scan.next();

					System.out.println("민첩성을 입력하세요 . ");
					int minchup = scan.nextInt();
					
					System.out.println("밸런스를 입력하세요 . ");
					int balance = scan.nextInt();
					
					System.out.println("몸싸움을 입력하세요 . ");
					int bodyShot = scan.nextInt();
					
					System.out.println("스피드를 입력하세요 . ");
					int speed = scan.nextInt();
					
					SoccerPlayer player = new SoccerPlayer(name,type,minchup,balance,bodyShot,speed);
					
					boolean regisOk= false;
					// 손흥민 차붐 발락 굴리트 박주영
					
					for(int i=0;i<players.length && !regisOk ;i++) {
						
						if(players[i] == null ) {
							players[i] = player;
							regisOk = true;
						}
					}
				}
				
			} else if (selected == 2) {	// 선수 리스트
				for(int i = 0;i <players.length;i++) {
					if(players[i] != null) {
						System.out.println(players[i].getName());
					}
				}
			} else if (selected == 3 ) { // 선수 확인
				System.out.println("선수의 이름을 입력하세요.");
				String searchName = scan.next();
				boolean isExist = false;
				
				for(int i = 0;i <players.length && !isExist;i++) {
					if(players[i] != null) {
						if(players[i].getName().equals(searchName)) { // 존재하는 경우, 정보 노출
							System.out.println(
								players[i].getName() + " , "+ 
								players[i].getCard() + " , "+
								players[i].getOvr()
							);
							isExist = true;
						} 
					}
				}
				
				if(!isExist) {
					System.out.println("등록되지 않은 선수입니다.");
				}
			} else if (selected == 4){
				System.out.println("종료처리 되었습니다.");
			}
		}
		
	}

}
