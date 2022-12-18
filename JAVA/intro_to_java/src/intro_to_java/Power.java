package intro_to_java;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int n = sc.nextInt();
	        long power = 1;

	        while(n != 0){
	            power = power * x;
	            --n;
	        }
	        System.out.print(power);
	        sc.close();

	}

}
