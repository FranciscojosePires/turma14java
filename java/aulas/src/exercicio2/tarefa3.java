package exercicio2;

import  java.util.Scanner ;

public class tarefa3 {
	//exercico 8 do dia  8~12~20
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int N;
		
		System.out.printf("Entre com um número inteiro: ");
		N = ler.nextInt();
		
		if (N>100)
		{
			System.out.printf("resposta:" + N + ".");
			
		}
		else
		{
			N =0;
			System.out.printf("resposta:0" + ".");
		}
	}
}
