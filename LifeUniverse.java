package codechef;

import java.util.Scanner;

public class LifeUniverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true){
		int num = sc.nextInt();
		if(num != 42){
			System.out.println(num);
		}
		else{
			System.exit(0);
		}
		}
	}

}
