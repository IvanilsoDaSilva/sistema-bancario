package entidades;

import interfaces.*;

public class Conta {
	private String numero, senha;
	private double saldo;
	private TipoConta tipoConta;
	private boolean bloqueada;
	private Cliente cliente;
	private Agencia agencia;
	
	public Conta(String numero, String senha, double saldo, TipoConta tipoConta, boolean bloqueada, Cliente cliente, Agencia agencia) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.bloqueada = bloqueada;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	
	public Conta() {
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public TipoConta getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	public boolean isBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	} 
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public String getRelatorio() {
		String relatorio = "";
		relatorio = "Nome do Cliente: "+this.getCliente().getIdentificacao()+"\nDocumento do Cliente: "+this.getCliente().getDocumento()+"\nSaldo do Cliente: "+this.getSaldo();
		return relatorio;
	}
}
