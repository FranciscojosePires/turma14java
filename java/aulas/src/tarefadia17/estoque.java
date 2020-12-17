package tarefadia17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class estoque {
	public static void main(String[] args)
	{
		List<String> produtos = new ArrayList();
		produtos.add("cadeira");
		produtos.add("sofá");
		produtos.add("mesa");
		produtos.add("tv");
		System.out.println("lista de produtos"+produtos);
		
		produtos.remove("tv");
		System.out.println("A lista atualizada é: "+produtos);
		
		for(String substituicao:produtos) 
		{
			System.out.println(produtos.indexOf(substituicao)+"|"+substituicao);
		}
		produtos.set(2, "oculos");
		System.out.println(produtos);
		
	
		
		
		
		
		
}
}