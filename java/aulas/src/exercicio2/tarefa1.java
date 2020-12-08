package exercicio2;

import  java.util.Scanner ;

public class tarefa1 {
	//exercico 2 do dia 8~12~20
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		String C;
		int N, salário = 0, horasT, horasE, salárioE =0;
		
		System.out.println("Entre com o código do trabalhador: ");
		C = ler.nextLine();
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		horasT = ler.nextInt();
		
		if (horasT > 50)
		{
			salário = 50 * 10;
			salárioE = (horasT - 50) * 20;
		}
		else
		{
			salário = horasT * 10;
		}
	
		System.out.println("O trabalhador " + C + " recebe salário total de R$ " + salário +
				" e salário excedente de R$ " + salárioE + "");
		
		
}

}
