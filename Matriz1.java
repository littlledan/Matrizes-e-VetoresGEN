package MatrizesVetores;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int m[][] = new int [3][3];
		int sp = 0;
		int ss = 0;
		int aux = 1;
		for(int L = 0; L< m.length; L++) {
			for(int C = 0; C< m.length; C++) {
				m[L][C] = aux;
				aux++;
			}
		}
		
		System.out.println("\nElementos da diagonal principal: \n");
		
		for(int L = 0; L< m.length; L++) {
			for(int C = 0; C< m.length; C++) {
				if(L == C) {
				System.out.print(" "+m[L][C]+" | ");
				sp = sp + m[L][C];

				}
			}
		}
		
		System.out.println("\n\nElementos da Diagonal secundaria: \n");
		
		for(int L = 0; L< m.length; L++) {
			for(int C = 0; C< m.length; C++) {
				if(L + C == 2) {
				System.out.print(" "+m[L][C]+" | ");
				ss = ss + m[L][C];
				}
			}
		}
		System.out.println("\n\nA soma dos elementos da diagonal principal é :"+sp);
		System.out.println("\nA soma dos elementos da diagonal secundaria é :"+ss);
	}
}