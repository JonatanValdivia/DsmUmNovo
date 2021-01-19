package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private double saldo;
	public String numero;
	public String titular; 
	public boolean ativa;
	public double limite;
	public double chequeEspecial;
	public void depositar(double valorDeposito) {
		if(valorDeposito < 0) {
			System.out.println("O valor deve ser maior que zero!");
		}else {
			saldo += valorDeposito;
		}
		System.out.println("Depósito de: " + valorDeposito);
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("Saldo + limite: " + (saldo + chequeEspecial));
	}
	//ja que vai retornnar saldo, que é um valor double, 
	//então ele é do tipo double
	public double getSaldo() { //Void não retona nada, ele é vazio. 
		return saldo;		   //Como propriamente é dito.
	}
	
	public void sacar(double valorDoSaque) {
		if(valorDoSaque <= (saldo + chequeEspecial)) { 
			saldo -= valorDoSaque; 
			System.out.println("Saque de: " + valorDoSaque);
		} else {
			System.out.println("Saldo insufuciente!");
		  }
	}
	
	public void transferir() {
		
	}
}
