package exercico9_12_20;
import java.util.Scanner;
public class atividadedia10questao3 
{//atividade do dia 10/12/20 questão 3

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		final int linha = 4, coluna = 6;
		int[] [] MatrizN1 = new int [4] [6]; int[] [] MatrizN2 = new int [4] [6];
	    
		int[] [] N1 = { {1,1,1,1,1,1}, {2,2,2,2,2,2}, {3,3,3,3,3,3}, {4,4,4,4,4,4}};
		int[] [] N2 = { {5,5,5,5,5,5}, {6,6,6,6,6,6}, {7,7,7,7,7,7}, {8,8,8,8,8,8}};
		
		int [][] M1 = new int [linha] [coluna]; int [][] M2 = new int [linha] [coluna]; 
		int l,c;
		
		for (l = 0; l < linha; l++)
		{
			for(c = 0; c < coluna; c++)
			{
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		System.out.println("Estruture a soma da matriz N1 com N2:\n");
		for(l = 0; l < linha; l++)
		{
			for(c = 0; c < coluna; c++)
			{
				System.out.print("\t[ " + M1[l][c] + " ]\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nEstruture a subtração da matriz N1 com N2:\n");
		for(l = 0; l < linha; l++)
		{
			for(c = 0; c < coluna; c++)
			{
				System.out.print("\t[ " + M2[l][c] + " ]\t");
			}
			System.out.println("\n");
		}

	}
}
