package unittests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EstoqueTest {

    @Test
    public void testAdicionarProduto() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto);
        assertTrue(estoque.listarProdutos().contains(produto));
    }

    @Test
    public void testRemoverProduto() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto);
        estoque.removerProduto(produto);
        assertFalse(estoque.listarProdutos().contains(produto));
    }

    @Test
    public void testGetQuantidadeProduto() {
        Produto produto1 = new Produto(1, "Produto A", 10.0, 5);
        Produto produto2 = new Produto(2, "Produto B", 20.0, 10);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        assertEquals(5, estoque.getQuantidadeProduto(1));
        assertEquals(10, estoque.getQuantidadeProduto(2));
        assertEquals(0, estoque.getQuantidadeProduto(3));
    }

    @Test
    public void testListarProdutos() {
        Produto produto1 = new Produto(1, "Produto A", 10.0, 5);
        Produto produto2 = new Produto(2, "Produto B", 20.0, 10);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        ArrayList<Produto> produtos = estoque.listarProdutos();
        assertEquals(2, produtos.size());
        assertTrue(produtos.contains(produto1));
        assertTrue(produtos.contains(produto2));
    }

}
