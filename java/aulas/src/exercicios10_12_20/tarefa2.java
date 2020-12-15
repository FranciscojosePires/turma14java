package exercicios10_12_20;
import java.util.Scanner;
public class tarefa2 {
  //atividade do dia 10/12/20 questão 2
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int soma = 0, media =0, vezes = 0, maiorLance = 0, i;
		int[] lancamento = new int [10]; 

		for (i=0; i<=9; i++)
		{
			System.out.println("Entre com o número do lançamento (de 1 a 6): " + i+ 1 + ":" );
			lancamento[i] = ler.nextInt();
			soma = lancamento[i] + soma;

			if(lancamento[i] <=0  || lancamento[i] > 6)
				System.out.println("O número digitado não está dentre os números apresentados em um dado comum!"
						+ "Digite entre 1 e 6.");
			if(lancamento[i] > maiorLance)
				maiorLance = lancamento[i];		
		}
		for(i=0; i<=9; i++)
		{
			System.out.println("\nO valor do lançamento " + i+ 1 + " foi: " + lancamento[i] + ".");
			if(lancamento[i] == maiorLance)
				vezes ++;
		}
		System.out.println("\nA média aritimética dos 10 lançamentos é: " + soma/10 + ".");
		System.out.println("\nO maior valor obtido dentre os 10 lançamentos foi: " + maiorLance + ".");
		System.out.println("\nA quantidade de vezes que o maior valor obtido apareceu foi: " + vezes + " vez(es).");
	}
}
