package listadia15;

public class main {

	public static void main(String[] args) {
		pessoa pessoa1 = new pessoa("kiko","lua","666");
		fornecedor fornecedor1= new fornecedor ("kiko","lua","666", 500, 200, 700);
		empregado empregado1=new empregado ("kiko","lua","666",123,1900,5);
		System.out.println(pessoa1.toString());
		System.out.println(fornecedor1.toString());
	    System.out.println(empregado1.toString());
	
	
	
	}

}
