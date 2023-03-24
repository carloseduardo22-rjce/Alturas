package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTAS PESSOAS SERÃO DIGITADAS? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] vetor = new String[n];
		double[] vetor2 = new double[n];
		double[] vetor3 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.println("NOME: ");
			vetor[i] = sc.next();
			System.out.println("Idade:");
			vetor2[i] = sc.nextDouble();
			System.out.println("Altura:");
			vetor3[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vetor3[i];
		}
		
		System.out.println();
		double avg = soma/n;
		System.out.printf("Altura média: %.2f%n", avg);
		
		double porcentagem = 0.0;
		for (int i=0; i<n; i++) {
			if (vetor2[i] < 16) {
				porcentagem += 1.0;
			}
		}
		
		double idademenor = porcentagem/n*100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", idademenor);
		
		// mostrando o nome das pessoas com menores de 16 anos
		for (int i=0; i<n; i++) {
			if (vetor2[i] < 16) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();
		
	}

}
