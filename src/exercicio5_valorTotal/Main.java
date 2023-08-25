package exercicio5_valorTotal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo, quantidade;
		double total;
		
		System.out.println("FAÇA JÁ SEU PEDIDO!!!");
		System.out.println("");
		System.out.println("Código: 1	Cachorro-Quente		Preço: R$4.00");
		System.out.println("Código: 2	X-Salada		Preço: R$4.50");
		System.out.println("Código: 3	X-Bacon			Preço: R$5.00");
		System.out.println("Código: 4	Torrada simples		Preço: R$2.00");
		System.out.println("Código: 5	Refrigerante		Preço: R$1.50");
		System.out.println("");
		System.out.println("");
				
		System.out.println("Digite o CÓDIGO do produto:");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade deste produto:");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("Total a ser pago: R$%.2f%n",total);
		}
		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total a ser pago: R$%.2f%n",total);
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.printf("Total a ser pago: R$%.2f%n",total);
		}
		else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.printf("Total a ser pago: R$%.2f%n",total);
		}
		else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Total a ser pago: R$%.2f%n",total);
		}
		else {
			System.out.println("Código digitado inválido!");
		}
	sc.close();
	}
}
