package intro_to_java;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1; i<=n; i++){
			int ap= 0;
			 ap += 3*i+2;
			if(ap%4==0){
				n++;
				continue;
			}

			System.out.print(ap+" ");
		}
		sc.close();

	}

}
