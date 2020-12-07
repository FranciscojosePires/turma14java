programa
{    //exercício de muneto 6 lista 2 
	//Aluno:francisco jose pires 
	//Infantil A = 5 a 7 anos
     //Infantil B = 8 a 11 anos
     //Juvenil A = 12 a 13 anos
     //Juvenil B = 14 a 17 anos
     //Adultos = Maiores de 18 anos

	funcao inicio()
	{
		inteiro idade
		escreva("informe qual a idade do nadador ")
		leia(idade)
		se(idade<5){escreva("não aceitamos nadadores menores que 5 anos ")}
		senao se (idade>=5 e idade<=7) { escreva (" o nadador esta no infantil A")} 
		senao se (idade>=8 e idade<=11) { escreva (" o nadador esta no infantil B")}
		senao se (idade>=12 e idade<=13) { escreva (" o nadador esta no juvenil A")}
		senao se (idade>=14 e idade<=17) { escreva (" o nadador esta no juvenil B")}
		senao se (idade>=18) { escreva (" o nadador é adulto")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */