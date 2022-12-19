package intro_to_java;

import java.util.Scanner;
public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trailing zeros handled
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		
		while(n>0) {
			if(n%10==0) {
				while(n%10!=0) {
					n = n/10;
					continue;
				}
			}
			rev= rev*10+n%10;
			n=n/10;
		}
		System.out.print(rev);
		sc.close();
	}

}
