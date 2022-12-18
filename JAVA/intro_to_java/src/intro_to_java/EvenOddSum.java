package intro_to_java;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumOdd = 0;
		int sumEven = 0;

		while(n > 0){
			int dig = n%10;
			if(dig%2 == 0 || dig == 0){
				sumEven = sumEven + dig;
			}
			else{
				sumOdd = sumOdd + dig;
			}
			n =n / 10;

		}

		System.out.print(sumEven+" "+sumOdd);
		sc.close();

	}

}
