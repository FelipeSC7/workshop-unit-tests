package unittests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarrinhoTest {

    @Test
    @DisplayName("Adicionar produto ao Carrinho")
    public void testAdicionarProdutoNoCarrinho() {
        Estoque estoque = new Estoque();
        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto(1, "Produto 1", 10.99, 5);
        Produto produto2 = new Produto(2, "Produto 2", 5.99, 3);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        ArrayList<Produto> produtosNoCarrinho = carrinho.getProdutos();

        assertEquals(2, produtosNoCarrinho.size());
        assertTrue(produtosNoCarrinho.contains(produto1));
        assertTrue(produtosNoCarrinho.contains(produto2));
    }

    @Test
    public void testRemoverProdutoDoCarrinho() {
    	Estoque estoque = new Estoque();
    	Carrinho carrinho = new Carrinho();
	    Produto produto1 = new Produto(1, "Produto 1", 10.99, 5);
	    Produto produto2 = new Produto(2, "Produto 2", 5.99, 3);
	
	    estoque.adicionarProduto(produto1);
	    estoque.adicionarProduto(produto2);
	
	    carrinho.adicionarProduto(produto1);
	    carrinho.adicionarProduto(produto2);
	
	    carrinho.removerProduto(produto1);

	    ArrayList<Produto> produtosNoCarrinho = carrinho.getProdutos();

	    assertEquals(1, produtosNoCarrinho.size());
	    assertFalse(produtosNoCarrinho.contains(produto1));
	    assertTrue(produtosNoCarrinho.contains(produto2));
    }
}
