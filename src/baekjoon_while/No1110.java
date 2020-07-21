package baekjoon_while;

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
		
		int a = 2;
		int b = 6;
		int c = 0; //첫 총합
		int k[] = new int[a]; //가변 숫자
		int k1[] = new int[b]; //가변 숫자 뒷자리 
		
		
		for(int i =0; i<100 ; i++) {
			c = a+b;
			
		}
		
		
	}

}
