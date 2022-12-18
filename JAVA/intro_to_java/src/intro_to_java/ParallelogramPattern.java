package intro_to_java;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int spaces = 1;
			while(spaces<=i-1){
				System.out.print(" ");
				spaces++;
			}
			int stars = 1;
			while(stars<=n){
				System.out.print("*");
				stars++;
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
