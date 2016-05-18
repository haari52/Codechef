package codechef;

import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++){
			int nr = sc.nextInt();
			String colors = sc.next();
			
			int cntR = 0,cntG = 0,cntB = 0;
			for(int c=0;c<nr;c++){
				if(colors.charAt(c) == 'R'){
					cntR ++;
				}
				else if(colors.charAt(c)=='G'){
					cntG ++;
				}
				else{
					cntB ++;
				}
			}
			
			int largest = cntR;
			 if(cntG >= largest){
				 largest = cntG;
			 }
			 if(cntB >= largest){
				 largest = cntB; 
			 }
			  
			System.out.println(nr-largest);
			 
		}
	}

}
