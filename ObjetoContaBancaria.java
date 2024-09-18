package Aula18_09;

public class ObjetoContaBancaria {
 
 public static void main (String[] agrs) {
	 
	 ContaBancaria conta = new ContaBancaria(100000.00);
	 
	 // saldo inical
	 System.out.println(conta.getSaldoO());
	 
	 // Dépositos
	 conta.depositar(500);
	 conta.depositar(1000);
	 
	 // mostrar saldo após 2 depositos
	 System.out.println(conta.getSaldoO());
	 
	 // Saque
	 conta.sacar(1500);
	 
	 // mostrar após saque
	 System.out.println(conta.getSaldoO());
 }
}
