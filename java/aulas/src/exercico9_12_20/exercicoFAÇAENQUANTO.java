package exercico9_12_20;
import java.util.Scanner;
public class exercicoFA�AENQUANTO {
	//FA�A...ENQUANTO atividade 2
	
		public static void main(String[] args)
		{
			Scanner ler = new Scanner(System.in);
			int numero, soma = 0, i;
				
			System.out.println("Entre com um n�mero:");
			numero = ler.nextInt();
			i = numero;
			
			do
			{
				soma = soma + i;
				i --;	
			}
			while (i >0);
			
			System.out.println("A soma de todos os n�meros �: " + soma + ".");	
		}
	}


