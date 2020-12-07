import java.util.Scanner;
import java.lang.Math;



public class CparaF {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		


		double f,res;
		System.out.print("informe a temperatura em Fahrenheit:");
		f= leia.nextShort();
		
		res = ((f-32) * 5 / 9);
	    System.out.print("A temperatura em Celsius é "+Math.round(res));
		

	}

}
