package entities;

public class Conta {
	
	private int num;
	private String nome;
	private double balance;

	public Conta(int num, String nome) {
		this.num = num;
		this.nome = nome;
	}
	
	public Conta(int num, String nome, double depoIni) {
		this.num = num;
		this.nome = nome;
		deposito(depoIni);
	}
	
	public int getNum () {
		return num;
	}
	
	public String getNome () {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposito(double valor) {
		balance += valor;
	}
	
	public void saque(double valor) {
		balance -= valor + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ num
				+ ", Titular: "
				+ nome
				+ ", Balanço: $"
				+ String.format("%.2f", balance);
	}
}
