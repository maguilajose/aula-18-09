package Aula18_09;

public class ContaBancaria {
//Atributo privado
	private double saldo;
	
	//Construtor para inicializar o saldo 
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		} else {
			this.saldo = 0;
		}
	}
	
	// Getter para o saldo
	public double getSaldoO() {
		return saldo;
	}
// Método para depositar dinheiro (só aceita valores positivos)
	public void depositar(double valor) {
		if (valor >0) {
			saldo += valor;
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}
	
// Método para sacar dinheiro (não pode sacar mais do que o saldo)
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		} else {
	       System.out.println("Saque inválido! Verifique o valor.");
       }
   }
}
