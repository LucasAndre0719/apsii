
public class Principal {
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		Banco banco2 = new Banco("Jorge ", "555.196.381-80", 56);
		
		System.out.println(banco1.getSaldo());
		banco1.setSaldo(10);
		System.out.println(banco1.getSaldo());
	}
}