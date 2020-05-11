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
	
    // CALCULOS
		consumo = (5.00*cerveja)+(3.00*refrigerante)+(7.00*espetinho);
		if (consumo >= 30.00){
			couvert = 0.00;
		}else{
			couvert = 4.00;
		}
		if (sexo == 'F' || sexo == 'f') {
			ingresso = 8.00;
		}else{
			ingresso = 10.00;
		}
		total = consumo + couvert + ingresso;

	// RELATÓRIO
		System.out.println("");
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if (couvert == 0.0){
			System.out.println("Isento de Couvert");
		}else{
			System.out.printf("Couvert = R$ %.2f%n", couvert);
		}
		System.out.printf("Ingresso = R$ %.2f%n", ingresso);
		System.out.printf("Valor a pagar = R$ %.2f%n",total);

		sc.close();
	}
}
