package FazendaPolilac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import loja.produto;


public class CadLoja {public static void main(String[] args) {

	final int tamanho = 80;
	double valorParcela=0,valorTotal = 0;
	char opcao, continua, continuaCompra;
	int  numeroParcela = 0,formaPagamento, anoNascimento, qtdeVendida, produtoCompra, entrada, anoAtual = 2020;
	String nome, cpf, compararProduto;
	char genero;

	List<Produto> lista= new ArrayList<>();
	List<Produto> carrinho = new ArrayList<>();

	lista.add(new Produto("P-001", "Queijo de manteiga", 20.00,10));
	lista.add(new Produto("P-002", "Queijo de manteiga com raspa", 20.00,10));
	lista.add(new Produto("P-003", "Queijo coalho", 20.00,100));
	lista.add(new Produto("P-004", "Queijo coalho com ervas finas", 20.00,12));
	lista.add(new Produto("P-005", "Queijo coalho zero lactose", 20.00,20));
	lista.add(new Produto("P-006", "Queijo cabra frescal", 20.00,60));
	lista.add(new Produto("P-007", "Queijo de cabra Maturado", 20.00,40));
	lista.add(new Produto("P-008", "Doce de leite artesanal", 20.00,25));
	lista.add(new Produto("P-009", "Doce de leite zero lactose", 20.00,30));
	lista.add(new Produto("P-010", "Doce de leite diet", 20.00,15));

	
	
	Scanner leia = new Scanner(System.in);

	linha(tamanho);
	System.out.println("\n\t\t\t\t   Fazenda Polilac");
	System.out.println("\t\t\tFando o melhor para a Familia !!!");
	linha(tamanho);
	System.out.println("\nDigite seu nome: ");
	nome = leia.nextLine();
	System.out.println("\nDigite seu gênero [M] Masculino,[F] Feminino ou [O] Não-Binário: ");
	genero = leia.next().toUpperCase().charAt(0);
	while (genero != 'M' && genero != 'F' && genero != 'O') {
		System.out.println("Valor incorreto. Digite seu gênero [M] Masculino,[F] Feminino ou [O] Não-Binário: ");
		genero = leia.next().toUpperCase().charAt(0);
	}
	System.out.println("Digite seu ano de nascimento: ");
	anoNascimento = leia.nextInt();
	while (anoNascimento < 1850 || anoNascimento > anoAtual) {
		System.out.println("Ano incorreto. Digite novamente seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
	}
	leia.nextLine();
	System.out.println("Digite o seu cpf: ");
	cpf = leia.nextLine();

	Cliente cliente1 = new Cliente(nome, genero, anoNascimento, cpf);
	do {
		linha(tamanho);
		if (tratamento(genero) == 'o') {
			System.out.println("\nSeja bem-vind" + tratamento(genero) + " a loja senhor " + cliente1.getNome());
		} else {
			System.out.println("\nSeja bem-vind" + tratamento(genero) + " a loja senhor" + tratamento(genero) + " "
					+ cliente1.getNome());
		}
		System.out.println("Cpf: " + cliente1.getCpf());
		System.out.printf("Idade: %d anos\n", cliente1.retornaIdade(anoAtual));

		linha(tamanho);

		System.out.println("\n[1] - Comprar produtos");
		System.out.println("[2] - Gerenciar estoques");
		System.out.println("[3] - Sair");
		System.out.println("\nDigite a opção: ");
		opcao = leia.next().charAt(0);
		while (opcao != '1' && opcao != '2' && opcao != '3') {
			System.out.println("Opção incorreto. Digite a opção: ");
			opcao = leia.next().charAt(0);
		}
		if (opcao == '1') {
			do {
				System.out.println("\n\t\t\t   Lista de Produtos");
				linha(tamanho);
				System.out.println("\nCódigo\t\tPreço\t     Quantidade\t\tProduto");
				for (Produto i : lista) {
					System.out.printf("\n%s\t\t%.2f\t\t%d\t\t%s\n", i.getCodigo(), i.getPrecoUnitario(),
							i.getQtdeProdutoEstoque(), i.getNomeProduto());
				}
				System.out.println("\nDigite o código do produto que será comprado: ");
				produtoCompra = leia.nextInt();
				if (produtoCompra < 10) {
					compararProduto = "MP-00" + (produtoCompra);
				} else {
					compararProduto = "MP-0" + (produtoCompra);
				}
				System.out.println("Digite a quantidade: ");
				qtdeVendida = leia.nextInt();
				while (qtdeVendida < 0) {
					System.out.println("Valor incorreto. Digite a quantidade: ");
					qtdeVendida = leia.nextInt();
				}
				for (Produto i : lista) {
					if (compararProduto.equals(i.getCodigo())) {
						if (i.venda(qtdeVendida)) {
							i.carrinho(qtdeVendida);
							valorTotal += i.carrinho(qtdeVendida);
							i.tiraEstoque(qtdeVendida);
							i.setQtdeVendida(qtdeVendida);
							carrinho.add(i);
						} else {
							System.out.println("\nQuantidade inválida!");
						}
					}
				}
				System.out.print("\nVocê deseja comprar mais algum produto (S ou N)? ");
				continuaCompra = leia.next().toUpperCase().charAt(0);
				while (continuaCompra != 'S' && continuaCompra != 'N') {
					System.out.print("\nOpção incorreta. Você deseja comprar mais algum produto (S ou N)? ");
					continuaCompra = leia.next().toUpperCase().charAt(0);
				}
			} while (continuaCompra == 'S');
			linha(tamanho);
			System.out.println("\n\t\tEscolha a forma de pagamento");
			linha(tamanho);
			System.out.println("\n[1] - PAGAMENTO A VISTA - 10% de desconto");
			System.out.println("[2] - DEBITO");
			System.out.println("[3] - CRÉDITO - 5% de juros");
			System.out.println("[4] - CRÉDITO 2x/3x - 10% de juros");
			formaPagamento = leia.nextInt();
			while(formaPagamento < 1 || formaPagamento > 4) {
				System.out.println("Opção incorreta. Digite uma forma de pagamento válida: ");
				formaPagamento = leia.nextInt();
			}
			if(formaPagamento == 1) {
				valorTotal = (valorTotal*0.9)*1.09;
			}
			else if(formaPagamento == 3) {
				valorTotal = (valorTotal*1.05)*1.09;
			}
			else if(formaPagamento == 4) {
				System.out.println("Digite em quantas vezes deseja comprar (2x ou 3x): ");
				numeroParcela = leia.nextInt();
				while(numeroParcela<2 && numeroParcela >3 ) {
					System.out.println("Valor incorreto. Digite em quantas vezes deseja comprar (2x ou 3x): ");
					numeroParcela = leia.nextInt();
				}
				valorTotal = (valorTotal*1.1)*1.09;
				valorParcela = valorTotal/numeroParcela;
			}
			linha(tamanho);
			System.out.println("\n\t\t\t   CUPOM FISCAL");
			System.out.println("CÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
			linha(tamanho);
			for (Produto i : carrinho) {
				System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
						i.getQtdeVendida(), i.getPrecoUnitario(), i.getPrecoUnitario() * i.getQtdeVendida());
			}
			linha(tamanho);				
			System.out.printf("\n\t\t\t    VL. TOTAL(Imposto de 9%%)  R$ %.2f \n", valorTotal);
			if(formaPagamento == 4) {
				System.out.printf("\n\t\t  NUM. PARCELAS  %d   VL. DAS PARCELAS R$% .2f\n", numeroParcela,valorParcela);
			}
			linha(tamanho);
			System.out.print("\n\nVocê deseja voltar para o menu (S ou N)? ");
			continua = leia.next().toUpperCase().charAt(0);
			while (continua != 'S' && continua != 'N') {
				System.out.print("\nOpção incorreta. Você deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
			}
		} else if (opcao == '2') {
			do {
				System.out.println("\n\t\t\t  Controle de Estoque");
				linha(tamanho);
				System.out.println("\nCódigo\t\t     Quantidade\t\tProduto");
				for (Produto i : lista) {
					System.out.printf("\n%s\t\t\t%d\t\t%s\n", i.getCodigo(), i.getQtdeProdutoEstoque(),
							i.getNomeProduto());
				}
				System.out.println("\nDigite o código do produto que será comprado: ");
				produtoCompra = leia.nextInt();
				if (produtoCompra < 10) {
					compararProduto = "MP-00" + (produtoCompra);
				} else {
					compararProduto = "MP-0" + (produtoCompra);
				}
				System.out.println("Digite a quantidade: ");
				entrada = leia.nextInt();
				while (entrada < 0) {
					System.out.println("Valor incorreto. Digite a quantidade: ");
					qtdeVendida = leia.nextInt();
				}
				for (Produto i : lista) {
					if (compararProduto.equals(i.getCodigo())) {
						if ((i.getQtdeProdutoEstoque() + entrada) > 10) {
							System.out.println("Quantidade inválida. Valor de estoque acima do permitido.");
						} else {
							i.adicionarEstoque(entrada);
						}
					}
				}
				System.out.print("\n\nVocê deseja comprar mais algum produto (S ou N)? ");
				continuaCompra = leia.next().toUpperCase().charAt(0);
				while (continuaCompra != 'S' && continuaCompra != 'N') {
					System.out.print("\nOpção incorreta. Vocêdeseja comprar mais algum produto (S ou N)? ");
					continuaCompra = leia.next().toUpperCase().charAt(0);
				}
			} while (continuaCompra == 'S');
			System.out.println("\nVocê deseja voltar para o menu (S ou N)? ");
			continua = leia.next().toUpperCase().charAt(0);
			while (continua != 'S' && continua != 'N') {
				System.out.print("Opção incorreta. Você deseja voltar para o menu (S ou N)? ");
				continua = leia.next().toUpperCase().charAt(0);
			}
		} else {
			System.out.printf("Obrigado! Volte sempre.");
			continua = 'N';
		}
	} while (continua == 'S');
	System.out.printf("Obrigado! Volte sempre.");
}

static void linha(int tamanho) {
	for (int x = 0; x < tamanho; x++) {
		System.out.print(".");
	}
}

public static char tratamento(char genero) {

	char pronome;

	if (genero == 'M') {
		pronome = 'o';
	} else if (genero == 'F') {
		pronome = 'a';
	} else {
		pronome = 'x';
	}
	return pronome;
}

}
