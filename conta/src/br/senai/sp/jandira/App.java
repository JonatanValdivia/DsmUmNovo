package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {
 
	public static void main(String[] args) {
		Conta contaDaAna;
		Conta contaDoJoao;
		/*Deve-se criar as variaveis c1 e c2 para armazenarem
		  os objetos "c1 = new Conta();"*/ 
		contaDaAna = new Conta();
		contaDoJoao = new Conta();
		//Chamando o atributo desejado e adicionando um valor a ele
		contaDaAna.numero = "111-98";
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.tipo = "Corrente";
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(450);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(300);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(228);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
        
		somar(10, 5);
	}
	
	//Métodos e parâmetros
	public static int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado; 
	}
}
