import java.util.Scanner;

public class Q6_JulioBandeira{
	public static void main(String[] args) {
		int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};
		
		int[][] matrizMultiplicacao = multiplicaMatrizes(matriz1, matriz2);
		
		
		for(int i = 0; i < matrizMultiplicacao.length; i++) {
			for(int j = 0; j < matrizMultiplicacao[i].length; j++) {
				System.out.print(matrizMultiplicacao[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] multiplicaMatrizes(int[][] matriz1, int[][] matriz2) {
		
		
		
		int[][] matrizMultiplicacao = new int[matriz1.length][matriz2[0].length];
		
	
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz2[0].length; j++) {
				int somaParcial = 0;
				for(int k = 0; k < matriz1[0].length; k++) {
					somaParcial += matriz1[i][k] * matriz2[k][j];
				}
				matrizMultiplicacao[i][j] = somaParcial;
			}
		}
		
		return matrizMultiplicacao;
	}
}
