import java.util.Scanner;

//Exercicio:3
public class Tarefa__1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); //instanciar = criar
		double nota1; 
		double nota2; 
		double nota3; 
		double mreal;
		
		System.out.println("Informe a primeira nota :");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe a segunda nota :");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe a terceira nota :");
		nota3 = leia.nextDouble();
		
		mreal=(nota1*2)+(nota2*3)+(nota3*5)/3;
		System.out.println("\n\nA media ponderada é :" + mreal);
	
	
	
	
	}
}
	
	
	
	
	


