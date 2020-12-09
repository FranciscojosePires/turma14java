package exercico9_12_20;
import java.util.Scanner;
public class exercicioenquanto {
	//ENQUANTO atividade 1
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int total = 0;
		float numero = 0, soma = 0, media = 0;
		
		
		while(numero >= 0)
		{
			System.out.println("Digite aqui valores númericos: ");
			numero = ler.nextInt();	
			if (numero > 0)	
			{
				soma = soma + numero;
				total = total + 1;					
			}		
		}
		media = soma / total;
		System.out.println("A soma dos números adicionados é: " + soma + ".");
		System.out.println("A média dos números adicionados é: " + media + ".");
		System.out.println("O total de números adicionados é: " + soma + ".");
	}

}
