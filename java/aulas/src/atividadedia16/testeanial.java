package atividadedia16;

public class testeanial {

	public static void main(String[] args) {
		
		animal silverado=new cavalo("silverado","8 anos","rincha","galopa");
		animal ted=new cachorro("ted","12 anos","late");
		animal lento=new preguica("lento","6 anos","zzzz","escala");
		
		System.out.println(silverado.getNome());
		System.out.println (silverado.getSom());
		System.out.println(silverado.getIdade());
		System.out.println(".................................");
		System.out.println(ted.getNome());
		System.out.println(ted.getSom());
		System.out.println(ted.getIdade());
		System.out.println(".................................");
		System.out.println(lento.getNome());
		System.out.println(lento.getSom());
		System.out.println(lento.getIdade());
		
		
	}

}
