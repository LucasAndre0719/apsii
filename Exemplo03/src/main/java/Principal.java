
public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo ("Uno",2000);
		Carro c1 = new Carro ("Uno",2000, 2);
		Moto m1 = new Moto ("Ninja 300",2025,300);
		
		
		System.out.println(v1.imprimirDetalhes());
		System.out.println(c1.imprimirDetalhes());
		System.out.println(m1.imprimirDetalhes());
		
	}
	
}
