package atividadedia16;

public class preguica extends animal {
	    
	private String subirEmArvores;
	
	    public preguica(String nome, String idade, String som,String subirEmArvores)
	    {
		super(nome, idade, som);
		this.subirEmArvores= subirEmArvores; 
	    }

		public String getSubirEmArvores() {
			return subirEmArvores;
		}

		public void setSubirEmArvores(String subirEmArvores) {
			this.subirEmArvores = subirEmArvores;
		}

}
