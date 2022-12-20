package patterns;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i<=n){
			int spaces = 1;
			while(spaces<=n-i){
				System.out.print(" ");
				spaces++;
			}
			int stars = 1;
			while(stars <= i){
				System.out.print('*');
				stars++;
			}
			int decStars = i-1;
			while(decStars >= 1){
				System.out.print('*');
				decStars--;
			}
			System.out.println();
			i++;
		}
		sc.close();

	}

}
