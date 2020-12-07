import java.util.Scanner;

//Exercicio:1 
public class Tarefa_1 { 
	public static void main(String[] args) {
		 
		Scanner leia = new Scanner (System.in); //instanciar = criar
		
		final short Diasdoano = 365;
		final short Diasdomes = 30;
		short dias;
		short meses;
		short anos;
		
		System.out.println("Informe a sua idade:");
		anos = leia.nextShort();
		
		System.out.print("informe o Mes atual: ");
		meses = leia.nextShort();
		
		System.out.print("informe o dia atual: ");
		dias = leia.nextShort();
		
        dias += (anos * Diasdoano) + (meses * Diasdomes);
		
		System.out.println("\n\nA sua idade em dias é :" + dias);
		
		}

}
