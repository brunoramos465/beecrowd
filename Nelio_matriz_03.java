package URI;

import java.util.Scanner;

public class Nelio_matriz_03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i< n; i++) {
			int max = 0;
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
			System.out.println(max);
		}
		
		
		sc.close();
	}
}