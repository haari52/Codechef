package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MovieWeekend {

	/**
	 * @param args
	 */
	static class quad{
		int index;
		int L;
		int R;
		int LR;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int t=0;t<tc;t++){
			int n = Integer.parseInt(br.readLine());
			String[] lenStr = br.readLine().split(" ");
			String[] RatStr = br.readLine().split(" ");
			quad[] arr = new quad[n];
			for(int i = 0;i<n;i++){
				arr[i] = new quad();
				arr[i].index = i;
				arr[i].L = Integer.parseInt(lenStr[i]);
				arr[i].R =Integer.parseInt(RatStr[i]);
				arr[i].LR = arr[i].L * arr[i].R;
			}
				Arrays.sort(arr, new Comparator<quad> (){

					@Override
					public int compare(quad x, quad y) {
						if(x.LR == y.LR){
							if(x.R == y.R){
								return x.index - y.index;
							}
							return y.R - x.R;
						}
						return y.LR - x.LR;
					}
				});
			 System.out.println(arr[0].index+1);
			}
		}
	}

