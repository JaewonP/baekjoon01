package baekjoon_train;

import java.util.Scanner;

public class SangeNaldefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		
		int burger[] = new int[3];
		int beverage[] = new int[2];
		int cheap_burger = 2000;
		int cheap_beverage = 2000;
		
		for(int i=0; i<3; i++ ) {
			burger[i] = scr.nextInt();
			
			if(burger[i]  < cheap_burger) {
				cheap_burger = burger[i];
			}
		}
		
		for(int i =0; i<2 ; i++) {
			beverage[i] = scr.nextInt();
			if(beverage[i] < cheap_beverage) {
				cheap_beverage = beverage[i];
			}
		}
		
		System.out.println(cheap_burger + cheap_beverage - 50);
		
		
		
	}

}
