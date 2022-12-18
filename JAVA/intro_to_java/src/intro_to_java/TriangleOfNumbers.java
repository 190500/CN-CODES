package intro_to_java;

import java.util.Scanner;

public class TriangleOfNumbers {

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
			int j = 1;
			int count = i;
			while(j<=i){
				System.out.print(count);
				count++;
				j++;
			}
			 int des = count - 2;
	        while(des>=i){
	         System.out.print(des);
                des--;
	        }
		System.out.println();
		i++;
		}
		sc.close();

	}

}
