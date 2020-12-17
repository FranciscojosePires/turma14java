package atividadedia16;

public class cachorro extends animal{
	
	private String corre;
	
	
	public cachorro(String nome, String idade, String som) 
	{
		super(nome, idade, som);
		this.corre =corre;
	}


	public String getCorre() {
		return corre;
	}


	public void setCorre(String corre) {
		this.corre = corre;
	}


	@Override
	public String () {
		return "cachorro [corre=" + corre + "]";
	}


	

	
	
	
	
}
