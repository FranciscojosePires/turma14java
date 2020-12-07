import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int horas,segundos, minutos,conta; 
		System.out.println("informe a duração em segundos ");
		segundos=leia.nextInt();
		horas=segundos/3600;
		minutos=(segundos%3600)/60;
		conta=(segundos%3600)% 60;
		System.out.println("O evento tem duração de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

	}

}
