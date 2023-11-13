package MatrizesVetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int [10];
		int x;
		int soma = 0;
		double media = 0;
		
		for(x = 0; x < vetor.length; x++) {
			
			System.out.println("\nDigite um numero: ");
			vetor[x] = scanner.nextInt();
		}
		System.out.println("\n\tOs elementos nos índeces ímpares são: \n");
		for(x =0; x < vetor.length; x++) {
			if(x % 2 != 0) {
				
				System.out.print(" "+vetor[x]+" | ");
			}
		}
		System.out.println("\n\tOs elementos pares são: ");
		for(x = 0; x < vetor.length; x++) {
			if(vetor[x] % 2 == 0) {
				
				System.out.print(" "+vetor[x]+" | ");
			}
		}
		
		for(x = 0; x < vetor.length; x++) {
			soma = soma + vetor[x];
			media = soma;
			media = media/ vetor.length;
		}
		
		System.out.printf("\nA soma dos valores dos índices é "+soma+" , e a media desses valores é "+media);
	}
}
