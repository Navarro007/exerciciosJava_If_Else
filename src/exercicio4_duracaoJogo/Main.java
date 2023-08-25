package exercicio4_duracaoJogo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite a hora que o jogo começou:");
		int inicio = sc.nextInt();
		System.out.println("Digite a hora que o jogo terminou:");
		int termino = sc.nextInt();
		
		int duracao;
		
		if (inicio < termino) {
			duracao = (termino - inicio);
		}
		else {
			duracao = 24 - inicio + termino;
		}
		
		
		System.out.println("O jogo durou " + duracao + " horas!");
		sc.close();
	}

}
