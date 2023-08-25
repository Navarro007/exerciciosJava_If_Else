package exercicio2_ImparPar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		}
		else {
			System.out.println("O número é ímpar!");
		}
		
		sc.close();
	}

}
