package com.kt.emp;

import java.util.Scanner;
import com.kt.animal.*;


public class Trainer implements EmployeeRole {
	
	private String name;

	public Trainer(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof String) {
			String params=(String)obj;
			
			if(params.equals(this.name)) {
				return true;
			} else {
				return false;				
			}
		} else {			
			return false;
		}
	}

	@Override
	public void work() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("안녕하세요. 조련사 "+name +"입니다.\n 무엇을 도와드릴까요 ? \n "
				+ "1. 동물 목록 보기 \n 2. 종료 \n");
		
		int selected=scan.nextInt();
		
		if(selected == 1) {
			System.out.println(name+"님의 동물 목록입니다.");
		}else if(selected ==2 ) {
			
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}


}
