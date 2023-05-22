package unittests;

public class Produto {
	
	 private int id;
	    private String nome;
	    private double preco;
	    private int quantidade;

	    public Produto(int id, String nome, double preco, int quantidade) {
	        this.id = id;
	        this.nome = nome;
	        this.preco = preco;
	        this.quantidade = quantidade;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public int getQuantidade() {
	        return quantidade;
	    }

	    public void setQuantidade(int quantidade) {
	        this.quantidade = quantidade;
	    }

	    public void aumentarQuantidade(int quantidade) {
	        this.quantidade += quantidade;
	    }

	    public void diminuirQuantidade(int quantidade) {
	        this.quantidade -= quantidade;
	    }
}
