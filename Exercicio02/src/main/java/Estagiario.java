
public class Estagiario extends Funcionario {
	
	private double vBolsaAuxilio;
	private double cargaHorariaSemanal;
	
	
	public Estagiario (String nome, String matricula, double salarioBase, String dataAdmissao, double vBolsaAuxilio, double cargaHorariaSemanal) {
		super(nome, matricula, salarioBase, dataAdmissao );
		
		this.vBolsaAuxilio = vBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;	
		
	}
	
	@Override
	public double calcularSalario() {
		return vBolsaAuxilio;
	}
	
	@Override
	public double calcularDesconto() {
		return 0.00; 
	}

}
