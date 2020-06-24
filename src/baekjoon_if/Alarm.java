package baekjoon_if;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 45분 일찍 알람 설정하기 
		// 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
		// 상근이가 설정한 알람 시각이 주어졌을 때, 언제로 고쳐야하는지 프로그램 
		
		// 두 정수 H, M (0 < = H <=23, 0 < = M <= 59) 현재 맞춰 놓은 시간 
		// 입력 시간은 24시간 표현 사용. 하루의 시작은 0:0(자정) / 하루의 끝은 23:59(다음날 자정 1분전) / 시간 표기시 불필요한 0은 사용하지 않는다.
		
		// 출력 : 설정해야할 알람 시간  
		// 10 : 10  -> 9 : 25
		// 10 : 20 -> 9 : 35
	
		// +15분 < 60 / -1 시간 
		// 10:45 -> 10:00
		// +15 = 60분이면 / +0 시간 

		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		

		// 10 : 20 -> 9 : 35	
		// +15분 < 60 / -1 시간 
		// M + 15 sysout 
		
		while(H !=0 ) {
		
			if((M + 15) < 60) {
				System.out.println((H-1) + " " + (M +15));
			}
			else {
				System.out.println((H-0) + " " + (M +15 - 60));
				
			}
		 return;
		}	
			
		if((M + 15) < 60) {
			System.out.println(23 + " " + (M +15));
		}
		else {
			System.out.println((H-0) + " " + (M +15 - 60));
		}


		// 10:45 -> 10:00
		// +15 = 60분이면 / +0 시간 
	
		
	}

}
