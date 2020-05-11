package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char sexo;
		int cerveja=0, refrigerante=0, espetinho=0;
		double consumo=0.0, couvert, ingresso, total;

	// LEITURA DOS DADOS
		System.out.print("Digite o sexo (F ou M): ");
		sexo = sc.next().charAt(0);						// LEITURA SOMENTE DA PRIMEIRA LETRA DIGITADA NA STRING
	
		System.out.print("Informe a quantidade de cervejas: ");
		cerveja = sc.nextInt();
		System.out.print("Informe a quantidade de refrigerantes: ");
		refrigerante = sc.nextInt();
		System.out.print("Informe a quantidade de espetinhos: ");
		espetinho = sc.nextInt();
	
		sc.close();
	}
}
