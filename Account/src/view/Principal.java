package view;

import java.util.Scanner;

import entities.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta conta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Deseja fazer depósito inicial? (y/n) ");
		char reposta = sc.next().charAt(0);
		
		if (reposta == 'y') {
			System.out.print("Digite o valor do depósito inicial: ");
				double depo = sc.nextDouble();
				conta = new Conta(number, name, depo);
			} else {
				conta = new Conta(number, name);
		}
		
		System.out.println("Acount data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDepo = sc.nextDouble();
		conta.deposito(valorDepo);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados: ");
		System.out.println(conta);
			
		sc.close();
	}

}
