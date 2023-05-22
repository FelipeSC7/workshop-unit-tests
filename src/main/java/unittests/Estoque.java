package unittests;

import java.util.ArrayList;

public class Estoque {
	
	   private ArrayList<Produto> produtos;

	    public Estoque() {
	        produtos = new ArrayList<Produto>();
	    }

	    public void adicionarProduto(Produto produto) {
	        produtos.add(produto);
	    }

	    public void removerProduto(Produto produto) {
	        produtos.remove(produto);
	    }

	    public int getQuantidadeProduto(int id) {
	        for (Produto produto : produtos) {
	            if (produto.getId() == id) {
	                return produto.getQuantidade();
	            }
	        }
	        return 0;
	    }

	    public ArrayList<Produto> listarProdutos() {
	        return produtos;
	    }
}
