import java.util.ArrayList;
import java.util.Date;

import entidades.*;

public class Main {
	public static void main(String[] args) {
		PessoaFisica cliente = new PessoaFisica();
		cliente.setNome("Roberto Silveira");
		cliente.setCpf("100.000.000-00");
		cliente.setRg("10.000.000-1");
		cliente.setNascimento(new Date());
		cliente.setContas(null);
		
//		PessoaJuridica cliente = new PessoaJuridica();
//		cliente.setRazaoSocial("G8 Soluções Integradas em SMS LTDA.");
//		cliente.setCnpj("1000/1000-0001-15");
//		cliente.setContas(null);
		
		Endereco endereco = new Endereco("58", "R. Guilherme Morisson", "Perto do Bar de Bebidas do Durval", "Tocos", "Campos dos Goytacazes", "RJ", "Brasil", "28000-000");
		Agencia agencia = new Agencia("001", endereco);
		
		Conta conta1 = new Conta();
		conta1.setCliente(cliente);
		conta1.setBloqueada(false);
		conta1.setNumero("1000 0000 0000 1");
		conta1.setTipoConta(TipoConta.CORRENTE);
		conta1.setSaldo(2001.00);
		conta1.setSenha("1234");
		cliente.setContas(new ArrayList <Conta>() {{add(conta1);}});
		conta1.setAgencia(agencia);
		
		System.out.println(conta1.getRelatorio());
	}
}
