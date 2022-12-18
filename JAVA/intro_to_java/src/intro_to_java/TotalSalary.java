package intro_to_java;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double basic = sc.nextInt();
		char grade = sc.next().charAt(0);

		double hra = 20*basic/100;
		double da = 50*basic/100;
		int allow = 0;
		double pf = 11.0*basic/100;

		switch(grade){
			case 'A':  allow = 1700; break;
			case 'B' : allow = 1500; break;
			default : allow = 1300; break;
		}

	double totalSalary = basic + hra + da + allow - pf;
	System.out.print((int)Math.round(totalSalary));
	sc.close();

	}

}
