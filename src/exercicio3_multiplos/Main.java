package exercicio3_multiplos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o primeiro número:");
		int A = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Estes números são Múltiplos!");
		}
		else {
			System.out.println("Estes números não são Múltiplos!");
		}
		
		sc.close();
	}

}
