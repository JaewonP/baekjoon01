package baekjoon_for;

import java.io.*;

public class FastSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
	//	StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int T = Integer.parseInt(br.readLine().trim());
	
		
		for(int i =0; i <T; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int A = Integer.parseInt(word[0]);
			int B = Integer.parseInt(word[1]);
			
			bw.write((A+B) + "\n");
		}
		bw.flush();
		br.close();

	}

}
