package baekjoon_while;
import java.io.*;
import java.util.StringTokenizer;


public class BufferPrintOutAB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		
		int a;
		int b;
		int sum;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.valueOf(st.nextToken());
			b = Integer.valueOf(st.nextToken());
			
			if(a!=0 && b <10) {
				sum = a+b;
				bw.write(sum + "\n");
				bw.flush();
			}
			else {
				break;
			}
		}
		
	
		br.close();
		bw.close();
		
	
	}

}
