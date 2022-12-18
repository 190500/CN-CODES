package intro_to_java;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();

		while(S<=E){
			int res =  (S-32)*5/9;
			System.out.println(S + " " +res) ;
			S=S+W;
		}
		sc.close();

	}

}
