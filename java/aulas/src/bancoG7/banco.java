package bancoG7;
import java.util.Scanner;
public class banco {

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		char opcaoMenuInicial;
		int tamanhoLinha=80, numeroOperacoes=3;
		String numeroConta="01";
		double saldoConta=0.00;
				
		
		desenhaLinha(tamanhoLinha);
		System.out.println("\n\t\t\t\t G7-Bank");
		desenhaLinha(tamanhoLinha);
		System.out.println("\nSERVI�OS DISPON�VEIS");
		System.out.println("\n[1] - CONTA POUPAN�A\r\n[2] - CONTA CORRENTE\n[3] - CONTA ESPECIAL\n"
				+ "[4] - CONTA EMPRESA\n[5] - CONTA UNIVERSIT�RIA\n[6] - SAIR");
		desenhaLinha(tamanhoLinha);
		System.out.print("\nDigite a op��o desejada: ");
		opcaoMenuInicial = leia.next().charAt(0);
		desenhaLinha(tamanhoLinha);
		
		if (opcaoMenuInicial == '4')
		{
			contaEmpresa(numeroConta, saldoConta, numeroOperacoes, tamanhoLinha);
		}
		

	}
	
	static void contaEmpresa (String conta, double saldo, int limiteOperacoes, int tamanhoLinha)
	{
		Scanner leia = new Scanner (System.in);
		System.out.printf("\nConta Empresa");
		System.out.printf("\nN�mero da conta: %s",conta);
		System.out.printf("\nSalto Atual: R$%.2f\n",saldo);
		desenhaLinha(tamanhoLinha);
		
		char operacao;
		double saldoAtual=saldo, valorOperacao;
		
		for (int i = 1; i <= limiteOperacoes; i++)
		{
			System.out.printf("\nQual transa��o deseja realizar [C]Credito ou D[D�bito]: ");
			operacao = leia.next().toUpperCase().charAt(0);
			System.out.printf("Informe o valor da transa��o: R$");
			valorOperacao = leia.nextDouble();
						
			if (operacao == 'C')
			{
				System.out.print("\nTransa��o realizada com sucesso.");	
				saldoAtual += valorOperacao;
				System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
				desenhaLinha(tamanhoLinha);
			}
			else if (operacao == 'D')
			{
				if ((saldoAtual - valorOperacao)>=0)
				{
					saldoAtual -= valorOperacao;
					System.out.print("\nTransa��o realizada com sucesso.");
					System.out.printf("\nSaldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
				else if ((saldoAtual - valorOperacao) < 0)				
				{
					System.out.println("\nVoc� nao possui saldo suficiente.");
					System.out.printf("Saldo Atual: R$%.2f\n",saldoAtual);	
					desenhaLinha(tamanhoLinha);
				}
			}
		}
	}	
		
		
		
		/*NUMERO DA CONTA: _
		 *EXIBE O SALDO ATUAL: SALDO[COME�A 0]
		 *TRANSA��O X[SER�O 10 TRANSA��ES] - LA�O PARA

		 *DEBITO OU CREDITO[O SALDO S� N�O PODE SER NEGATIVO]:
		 *VALOR: XXXX
		 *NOVO SALDO CONTA

		 *AP�S OS 10 CONTINUAR SIM OU N�O: SE SIM MOSTRA O SALDO ATUAL E 
		 *COME�A MAIS 10 TRANSA��ES, SEN�O VOLTA PARA O MENU INICIAL.
		 * 
		 */
	static void desenhaLinha (int linha)
	{
		for (int i = 1; i<=linha; i++)
		{
			System.out.print("�");
		}
	}}	