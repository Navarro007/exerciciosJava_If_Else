package exercicio6_intervalo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um número:");
		x = sc.nextDouble();
		
		if (x < 0.0 || x > 100.0) {
			System.out.println("Este número está fora de intervalo");
		}
		else if(x <= 25.0) {
			System.out.printf("Este número está no intervalo (0,25)! %n");
		}
		else if (x <= 50.0) {
			System.out.println("Este número está no intervalo (25,50)!");
		}
		else if (x <= 75.0) {
			System.out.println("Este número está no intervalo (50,75)!");
		}
		else {
			System.out.println("Este número está no intervalo (75,100)!");
		}
		
		sc.close();
	}

}