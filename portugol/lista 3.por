programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{//exercico numero-6 aluno:Francisco joose
		real x1,x2,y1,y2,d,x,y
		escreva("digite o valor de x1: ")
		leia(x1)
		escreva("digite o valor de x2: ")
		leia(x2)
		escreva("digite o valor de y1: ")
		leia(y1)
		escreva("digite o valor de y2: ")
		leia(y2)
          x= Matematica.potencia(x2-x1,2)
          y= Matematica.potencia(y2-y1,2)
          d=Matematica.raiz(2,x+y)
          escreva("o valor de de D é: " ,Matematica.arredondar(d,2))

		}
	     
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */