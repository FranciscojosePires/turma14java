package listadia15;

public class fornecedor extends pessoa {
           private double valorCredito;
           private double valorDivida;
		   private double Saldo;
		
           
           
           
           public fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida,
				double saldo) {
			super(nome, endereco, telefone);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
			Saldo = saldo;
		}
		public double getValorCredito() {
			return valorCredito;
		}
		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}
		public double getValorDivida() {
			return valorDivida;
		}
		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
	
	   
		public double getSaldo() {
			return Saldo;
		}
		public void setSaldo(double saldo) {
			Saldo = saldo;
		}
		public double obterSaldo(){
		 
	    	this.Saldo=this.valorDivida -this.valorCredito;
	    	return Saldo;
	    			
	    }
		@Override
		public String toString() {
			return "fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", Saldo=" + Saldo
					+ "]";
		}
		
		
}
