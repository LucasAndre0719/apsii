
public class Carro extends Veiculo {
	
	public int numPortas;
	
	
	public Carro(String novoModelo, int novoAno, int numPortas) {
		super(novoModelo,novoAno);
		this.numPortas = numPortas;
		
	}
	
	public String imprimirDetalhes() {
		return "Modelo: " + modelo + "\nAno: "+ ano + "\nNumero de Portas:"+ numPortas;
		
	}
	
	

}
