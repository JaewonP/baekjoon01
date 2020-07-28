package baekjoon_array;

import java.util.Scanner;

public class N10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);

		int a = scr.nextInt(); //N개의 정수가 주어진다. 
		int k = 1000000;  
		int k1 = -1000000;
		int temp[] = new int[a];
		int temp2 =0; //임시변수 
		
		for(int i = 0; i<a ; i++) {
			int b = scr.nextInt();
			temp[i] = b;
		}
		
		for(int j = 0; j<temp.length; j++) { //0  1  1                       
			if(k>temp[j])
				{
					k = temp[j]; //제일 작은 수
				}
			if(k1<temp[j]) {
				k1 = temp[j]; //제일 큰 수 
			};
		}

		System.out.print(k + " " + k1);

		scr.close();
	}
	

}
