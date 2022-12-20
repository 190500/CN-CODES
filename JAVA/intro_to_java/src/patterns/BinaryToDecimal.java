package patterns;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 0;
		int i = 0;
		while(n>0){
			int dig = n%10;
			number += dig*((int)Math.pow(2,i));
			n/=10;
			++i;

		}
		System.out.print(number);
		sc.close();

	}

}
