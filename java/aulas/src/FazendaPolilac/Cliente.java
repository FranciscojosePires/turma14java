package FazendaPolilac;
import java.util.Scanner;
public class Cliente extends Pessoa {
	private String cpf;

	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	public String novoCpf() {
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite seu cpf novamente: ");
		this.cpf = leia.nextLine();
		return this.cpf;
	}

}
