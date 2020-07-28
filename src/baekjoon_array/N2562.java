package baekjoon_array;

import java.util.Scanner;

public class N2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);

		int k = 0;  
		int temp[] = new int[9];
		int cnt =1;
		int cnt_temp =0;
		
		for(int i = 0; i<9 ; i++) {
			int b = scr.nextInt();
			temp[i] = b;
		}
		
		for(int j = 0; j<temp.length; j++) { //0  1  1                       
			if(k<temp[j])
				{
					k = temp[j]; //제일 큰 수
					cnt_temp = cnt;
				}
			cnt++;
			}
	
		System.out.println(k);
		System.out.println(cnt_temp);

		scr.close();
		}

	}


