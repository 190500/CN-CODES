package intro_to_java;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		System.out.print("*\n");
		while (i <= n) {
			System.out.print("*");
			int num = 1;
			while (num <= i) {
				System.out.print(num);
				num++;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print(dec);
				dec--;
			}
			System.out.print("*");
			System.out.println();
			i++;
		}
		int j = n - 1;
		while (j >= 1) {
			System.out.print("*");
			int num = 1;
			while (num <= j) {
				System.out.print(num);
				num++;
			}
			int dec = j - 1;
			while (dec >= 1) {
				System.out.print(dec);
				dec--;
			}
			System.out.print("*");
			System.out.println();
			j--;
		}
		 System.out.println("*");
		sc.close();
	}

}
