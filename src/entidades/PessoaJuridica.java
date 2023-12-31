package entidades;

import java.util.List;

import interfaces.*;

public class PessoaJuridica extends Pessoa implements Cliente {
	private String razaoSocial, cnpj;
	
	public PessoaJuridica(String razaoSocial, String cnpj, List<Conta> contas) {
		super(contas);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {
		super();
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String getIdentificacao() {
		return this.getRazaoSocial();
	}

	@Override
	public String getDocumento() {
		return this.getCnpj();
	}
}
