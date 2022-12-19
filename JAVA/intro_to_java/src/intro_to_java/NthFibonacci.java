package intro_to_java;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num1  = 1;
		int num2 = 1;
		int res=0;
		for(int i=1; i<=n; i++){
			num1 = num2;
			num2 = res;
			res=num1+num2;
		}
		System.out.print(res);
		sc.close();
	}

}
