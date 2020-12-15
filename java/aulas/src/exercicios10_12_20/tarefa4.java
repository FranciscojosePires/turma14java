package exercicios10_12_20;
import java.util.Scanner;
public class tarefa4 
{
	public static void main(String[] args) 
{
	Scanner leia = new Scanner (System.in);
int linha=3,coluna=3;
int l, c;
String diagPrincipal= new String();
String soma = new String();
String z = new String();
 
for(l=0;l<linha;l++) 
 {
	for(c=0;c<coluna;c++) 
	{
		System.out.println("Digite o valor de ["+l+"]"+"["+c+"]:" );
	    z=leia.next();
	    soma = soma + z;
	    if (l==c) 
	    {
	    	diagPrincipal=diagPrincipal+z;
	    }
	}
 }
for(l=0;l<linha;l++) 
{
	for(c=0;c<coluna;c++) 
	{
		System.out.println("["+z+"]");
	}
	System.out.println("\n");
}
System.out.println("A soma de todos os elementos é"+soma+"o valoe da diagonal principal é:"+diagPrincipal);
}

}
