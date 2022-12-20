package patterns;

import java.util.Scanner;

public class NumberStarPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1; 
		while(i<=n){
			int j = n;
			while(j>=1){
				if(j==i){
					System.out.print("*");
					j--;
					continue;
				}
				System.out.print(j);
				j--;
			}
		System.out.println();
		i++;

		}
		sc.close();

	}

}
