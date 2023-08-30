package br.com.santander.conta;

import java.math.BigDecimal;

public class Conta {
	private int numero;
	private String agencia;
	private String nomeCliente;
	private BigDecimal saldo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Ola ".concat(this.nomeCliente).concat("! Obrigado por criar uma conta em nosso banco, sua agencia e ")
				+ this.agencia + ", conta " + this.numero + " e seu saldo de R$ " + this.saldo
				+ " ja esta disponivel para saque";
	}
}
