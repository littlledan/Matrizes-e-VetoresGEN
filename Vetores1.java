package MatrizesVetores;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int [10];
		vetor [0] = 2;
		vetor [1] = 5;
		vetor [2] = 1;
		vetor [3] = 3;
		vetor [4] = 4;
		vetor [5] = 9;
		vetor [6] = 7;
		vetor [7] = 8;
		vetor [8] = 10;
		vetor [9] = 6;
		int num;
		int x;
		int cont = 0;
		
		System.out.println("\nDigite o numero que procura: ");
		num = scanner.nextInt();
		
		for(x = 0;x < vetor.length; x++) {
			
				if(num == vetor[x]) {
					cont = x;
				}
			}
				if(cont == 0) {
					System.out.println("\nO numero "+num+" não foi encontrado!");
				}else {
				System.out.println("\nO numero "+num+" esta na posição "+cont);
				}
		}
	}

