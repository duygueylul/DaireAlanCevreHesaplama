package proje_3;


import java.util.Scanner;
public class DaireAlanCevreHesaplama {

	public static void main(String[] args) {
		int r;
		double alan, hacim, pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Daire yarıçapını giriniz: \n");
		r = input.nextInt();
		alan = 2 * (pi * r);
		hacim = pi * (r * r);
		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Hacmi: " + hacim);

	}

}
