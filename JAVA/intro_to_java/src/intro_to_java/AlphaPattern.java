package intro_to_java;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int j =1;
			while(j<=i){
				System.out.print((char)('A'+i-1));
				j++;
			}
			System.out.println();
			i++;
		}
			sc.close();

	}

}
