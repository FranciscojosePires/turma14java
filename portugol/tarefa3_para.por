programa
{
	/*Desenvolver um sistema que efetue a soma de 
	 * todos os números ímpares que são  múltiplos de três e que 
	 * se encontram no conjunto dos números de 1 até 500.
	 * 
	 */
	funcao inicio()
	{
		inteiro stn=0,contador
		para (contador=1; contador <= 500;contador++ )
		 
		{
			se ((contador%3)==0 e (contador%2)!=0)
			{
				stn=stn+contador,
			}
			
		}
		escreva("a soma dos numeros multiplos de 3 e impares : ",stn)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */