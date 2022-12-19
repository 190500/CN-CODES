package intro_to_java;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] binaryNum = new int[1000];

		int i = 0;
		if (n == 0) {
			System.out.print(n);
		} else {
			while (n > 0) {
				binaryNum[i] = n % 2;
				n = n / 2;
				i++;
			}

			for (int j = i - 1; j >= 0; j--) {
				System.out.print(binaryNum[j]);
			}

		}
		sc.close();

	}

}
