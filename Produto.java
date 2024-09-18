package Aula18_09;

public class Produto {
//Atributos privados 
	private String nome;
	private double preco;
	
	// Construtor 
	public Produto(String nome, double preco) {
		this.nome = nome;
		setPreco(preco);
		
	}
	
	// Getter para o nome 
	public String getNome() {
		return nome;
	}
	
	// Setter para o nome 
	public void setNome(String nome) {
		this.nome = nome;
		
		// Getter para preço
		public double getPreco() {
			return preco;
		}
		
		//setter para o preço com validação
		public void setPreco(double preco) {
			if (preco >= 0) {
				this.preco = preco;
			} else {
				System.out.print("Preço inválido! Não pode ser negativo.");
			}
		}
		
		//Método para exibir informações do produto
		public void exibirInformacoes() {
			System.out.print("Produto: " + nome + ", Preço: " + preco);
			}
		}
