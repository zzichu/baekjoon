package src.Bronze;

import java.io.*;
import java.util.StringTokenizer;
public class BOJ5543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2; i++){
        	b = Math.min(b, Integer.parseInt(br.readLine()));
        }
        int d = Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
        System.out.println(b + d - 50);
	}
}
