package com.kt.main;

import java.util.Scanner;

import com.kt.animal.Animal;
import com.kt.animal.Carnivore;
import com.kt.animal.Herbivore;
import com.kt.emp.EmployeeRole;
import com.kt.emp.Management;
import com.kt.emp.Trainer;

//동물원 관리

//동물 - 종, 나이, 무게

//직원 - 역할(조련사, 경영 등등), 이름
//조련사는 동물들을 담당합니다.

//동물은 육식/초식으로 나누어서 관리됩니다.
//주식으로 분류하여 동물 목록을 볼 수 있음.
//조련사 담당에 따라 동물 목록을 볼 수 있음. (담당자가 없는 동물도 볼 수 있어야 함)

public class Start {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[Animal.MAX_COUNT];
		
		EmployeeRole[] emps = new EmployeeRole[EmployeeRole.MAX_COUNT];
		emps[0] = new Trainer("이동준");
		emps[1] = new Management("이한주");
		
		animals[0] = new Carnivore("Dog", 7, 1, (Trainer)emps[0]);
				
		Scanner scan = new Scanner(System.in);
		
		int selected =0;
		while(selected<5) {
			System.out.println("1. 조련사 조회 \n2. 동물 등록 \n3.육식 동물 조회\n4.초식 동물 조회" );
			selected = scan.nextInt();
			if(selected == 1) {
				System.out.println("조련사 명을 입력해주세요.");
				String name = scan.next();
				
				
				for(EmployeeRole member:emps) {
					if (member instanceof Trainer) {	//객체가 Trainer인지
						Trainer train=(Trainer)member;
						
						if(train.getName().equals(name)) {	//트레이너가 존재한다면..
							for(Animal ani:animals) {
								if (ani instanceof Carnivore) {	//객체가 육식인 경우
									Carnivore carni=(Carnivore)ani;
									
									System.out.println("육식동물 =>"+carni.getType());
								} else if (ani instanceof Herbivore) {	// 초식
									Herbivore herbi = (Herbivore)ani;
									
									System.out.println("초식동물 =>"+herbi.getType());
								}
							}
						}
						train.work();
					}
				}
			} else if(selected ==2){	//동물등록
				for(int i=0; i< animals.length;i++) {
					if(i % 2 == 1) {
						//육식
						animals[i] = new Carnivore("Tiger"+i, 7, 1, (Trainer)emps[0]);
					} else {
						animals[i] = new Herbivore("Kirin"+i, 7, 1, (Trainer)emps[1]);
					}
				}
			} else if(selected ==3){	// 육식
				for(Animal aniaml:animals) {
					if (aniaml instanceof Carnivore) {	//객체가 육식인 경우
						
						Carnivore carni=(Carnivore)aniaml;
						System.out.println("육식동물 =>"+carni.getType());
						
					}
				}
			} else if(selected ==4){	// 초식
				for(Animal aniaml:animals) {
					if (aniaml instanceof Herbivore) {	// 초식
						Herbivore herbi = (Herbivore)aniaml;
						System.out.println("초식동물 =>"+herbi.getType());
					}
				}
			}
		}
	}

}
