package codechef;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Save_The_Trees {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++){
			int N = Integer.parseInt(br.readLine());
			int numOfPoints = (N*2 -3);
			int[] A = new int[N];
			Point2D[] points = new Point2D[numOfPoints];
			String[] input = br.readLine().split(" ");
			for(int c = 0;c<N;c++){
				A[c] = Integer.parseInt(input[c]);
			}
		}

	}

}
