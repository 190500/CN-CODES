package intro_to_java;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(temp>0){
			rev = rev*10 + temp%10;
			temp = temp / 10;
		}
		if(rev == n){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}

		sc.close();

	}

}
