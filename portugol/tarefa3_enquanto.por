programa
{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
	 * apresente no final o total do somatório, a média e o total de valores lidos. 
	 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
	 * fornecendo valores positivos.Ou seja, o programa deve parar quando o 
	  usuário fornecer um valor negativo.
	 */
	funcao inicio()
	{
		real numero=0, soma=0
		inteiro  total=0
		
		enquanto (numero>= 0)
		{
			escreva("\nEntre com o número positivo: ")
			leia(numero)
			se(numero >= 0)
			{
				soma=soma+numero total++
				
			}
		}
		
		escreva("\nA soma dos número adicionados: ",soma )
		escreva("\nA média dos número adicionados: ",soma/total)
		escreva("\nO total de número adicionados: ",total)
	}
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 763; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */