package codechef;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		float currBal = sc.nextFloat();
		DecimalFormat form = new DecimalFormat("0.00");
		
		if(cash % 5 != 0 || (cash +0.50)>currBal){
			System.out.println(form.format(currBal));
		}
		else{
			float val = (float) (currBal - cash - 0.50);
			System.out.println(form.format(val));
		}
	}

}
