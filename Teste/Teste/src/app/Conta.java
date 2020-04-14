package app;

public class Conta {

	private String numeroConta;
	private String nome;
	private double saldo;

	public Conta(String numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositar(depositoInicial);
	}

	public Conta(String numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void sacar(Double valor) {
		saldo -= (valor + 5);
	}

	public String toString() {
		return "Número da conta: " + numeroConta + ", Titular: " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
	}

}