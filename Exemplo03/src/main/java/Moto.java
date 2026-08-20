
public class Moto extends Veiculo {
	
	public int cilindradas;
	
	
	public Moto(String novoModelo, int novoAno, int cilindradas) {
		super(novoModelo,novoAno);
		this.cilindradas = cilindradas;
		
	}
	
	public String imprimirDetalhes() {
		return "Modelo: " + modelo + "\nAno: "+ ano + "\nNumero de Cilindradas:"+ cilindradas;
		
	}
	
	

}