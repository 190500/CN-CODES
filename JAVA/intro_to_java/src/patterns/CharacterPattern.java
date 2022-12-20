package patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i=1;
		while(i<=n){
			char p = (char)('A'+i-1);
			int j=1;
			while(j<=i){
				System.out.print(p);
				p = (char)(p+1);
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();

	}

}
