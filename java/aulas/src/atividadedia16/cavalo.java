package atividadedia16;

public class cavalo extends animal {
   
	private String corre;
    
	public cavalo(String nome, String idade, String som,String corre) {
		super (nome,idade,som);
		this.corre = corre;
		}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

}
