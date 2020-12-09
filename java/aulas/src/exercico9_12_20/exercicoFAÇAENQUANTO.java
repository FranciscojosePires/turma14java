package exercico9_12_20;
import java.util.Scanner;
public class exercicoFAÇAENQUANTO {
	//FAÇA...ENQUANTO atividade 2
	
		public static void main(String[] args)
		{
			Scanner ler = new Scanner(System.in);
			int numero, soma = 0, i;
				
			System.out.println("Entre com um número:");
			numero = ler.nextInt();
			i = numero;
			
			do
			{
				soma = soma + i;
				i --;	
			}
			while (i >0);
			
			System.out.println("A soma de todos os números é: " + soma + ".");	
		}
	}


