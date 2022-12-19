package intro_to_java;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int choice = sc.nextInt();
		int res=0;
		if(choice==1){
			for(int i=1; i<=n; i++){
				res+=i;
			}
			System.out.print(res);
		}
		else if(choice==2){
			++res;
			for(int i=1; i<=n; i++){
				res*=i;
			}
			System.out.print(res);
		}
		else{
			System.out.print(-1);
		}
		sc.close();

	}

}
