import java.util.Scanner;

   public class tarefa___1 {
	   public static void main(String[] args) {
			 
			Scanner leia = new Scanner (System.in); //instanciar = criar
			
			double a=0; double b=0;double c=0;double d=0;double r=0;double s=0;	
			
			System.out.print("Informe o valor de a :");
			a = leia.nextShort();
			System.out.print("Informe o valor de b :");
			b = leia.nextShort();
			System.out.print("Informe o valor de c :");
			c = leia.nextShort();
			
			r+=(a+b)*(a+b);
			s+=(b+c)+(b+c);
			d=+(r+s)/2;
			System.out.println("o valor de d é :"+d);
	   }		
}
