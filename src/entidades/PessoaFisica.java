package entidades;

import java.util.Date;
import java.util.List;

import interfaces.*;

public class PessoaFisica extends Pessoa implements Cliente{
	private String nome, cpf, rg;
	private Date nascimento;
	
	public PessoaFisica(String nome, String cpf, String rg, Date nascimento, List<Conta> contas) {
		super(contas);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	public PessoaFisica() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String getIdentificacao() {
		return this.getNome();
	}

	@Override
	public String getDocumento() {
		return this.getCpf();
	}
}
