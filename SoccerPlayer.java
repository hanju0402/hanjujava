package com.nexon.fifa;

public class SoccerPlayer {
	private String name ;
	// 카드 타입
	private String card ; 
	//민첩성
	private int quickness;
	//밸런스
	private int balance;
	// 몸싸움
	private int physical;
	// 스피드 (속/가)
	private int speed;
	
	public SoccerPlayer() {
	}
	
	public SoccerPlayer(String name, String card, int quickness, int balance, int physical, int speed) {
		super();
		this.name = name;
		this.card = card;
		this.quickness = quickness;
		this.balance = balance;
		this.physical = physical;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getQuickness() {
		return quickness;
	}
	public void setQuickness(int quickness) {
		this.quickness = quickness;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPhysical() {
		return physical;
	}
	
	public void setPhysical(int physical) {
		this.physical = physical;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getOvr() {
		return (quickness+balance+physical+speed)/4;
	}
	
}
