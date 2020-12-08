package exercicio2;

import java.util.Scanner;

public class tarefa1a {
	//exercicio 1 do dia 08-12-2020
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int peso, excesso = 0, multa =0;
		
		System.out.println("informe o peso dos peixes! ");
		peso = ler.nextInt();
		
		if (peso > 50)
		{	
			excesso = excesso + (peso -50);
			multa = excesso * 4;
		}
		else if (peso <= 50 && peso>0)
		{
			excesso = 0;
		    multa = 0;
		}
		
		System.out.println("O excesso de peso foi de: "  + excesso + "Kg"+ " e a multa a ser paga é de: R$ " + multa + ".");
}

}
