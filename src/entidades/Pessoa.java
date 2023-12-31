package entidades;

import java.util.List;

public abstract class Pessoa {
	protected List<Conta> contas;
	
	public Pessoa(List<Conta> contas) {
		this.contas = contas;
	}
	
	public Pessoa() {
	}

	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
