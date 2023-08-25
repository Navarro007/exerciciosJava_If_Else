package exercicio1_positivoNegativo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é Negativo");
		}
		else {
			System.out.println("O número é Positivo");
		}
		
	sc.close();
	}

}
