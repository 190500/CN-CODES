package intro_to_java;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		 for (int i = 2; i <= n; i++)
    {
        if (isPrime(i))
            System.out.println(i + " ");
    }
		 sc.close();
		
	}

	 static boolean isPrime(int n){
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 ||
				n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 ||
					n % (i + 2) == 0)
				return false;

		return true;
	}

	}


