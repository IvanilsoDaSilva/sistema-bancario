package entidades;

public class Agencia {
	private String numero;
	private Endereco endereco;
	
	public Agencia(String numero, Endereco endereco) {
		this.numero = numero;
		this.endereco = endereco;
	}
	
	public Agencia() {
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
