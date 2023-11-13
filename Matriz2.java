package MatrizesVetores;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double v [] = new double [10];
		double m [][] = new double [10][4];
		double soma = 0;
		
		for(int L = 0; L < 10; L++) {
			System.out.println("\nDigite as notas do aluno "+ (L + 1)+": ");
			for(int C = 0; C < 4; C++) {
				System.out.print("\n"+ (C + 1)+ " Bimestre: ");
				m [L][C] = scanner.nextDouble();
			}
		}
		
		System.out.println("\n\t\tMedia geral dos alunos: ");
		
		for(int L = 0; L < 10; L++) {
			for(int C = 0; C < 4; C++) {
				soma = soma + m[L][C];
				
			}
			v[L] = soma / 4;
			soma = 0;
			System.out.println("\nAluno "+(L + 1)+", media = "+ v[L]);
		}

	}

}
