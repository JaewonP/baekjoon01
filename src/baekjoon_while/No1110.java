package baekjoon_while;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 <= a <= 99
		// 10보다 작으면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		// 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
		// ex 26 -> 2 +6 =8 -> 새로운 수는 68 - - -> 다시 26으로
		// 사이클 길이는 4
		// N의 사이클 길이를 구하는 프로그램
		
		//배열 이용해야할 것 같은데
		
		Scanner scanner = new Scanner(System.in);
		
		int i =0;
		int j = scanner.nextInt();
		int count =0;

	//	int k[] = new int[4]; //첫 숫자
		//k1 = i+1
	
		//k3 = k2 + 1

		int k1 = j/10;
		int k2 = j%10;
		
		int h=0;
		scanner.close();
		while(true) {
			
			count++;
			h = k2;
			k2 = (k1 +k2)%10;
			k1 = h;
			if(j == h*10 + k2  ) {
				System.out.println(count);
				break;
			}
			i++;
			
		}
		
		
	}
}


