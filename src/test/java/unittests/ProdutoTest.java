package unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	@Test
    public void testGetId() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        assertEquals(1, produto.getId());
    }

    @Test
    public void testGetNome() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        assertEquals("Produto A", produto.getNome());
    }

    @Test
    public void testGetPreco() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        assertEquals(10.0, produto.getPreco(), 0.001);
    }

    @Test
    public void testGetQuantidade() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        assertEquals(5, produto.getQuantidade());
    }

    @Test
    public void testSetQuantidade() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        produto.setQuantidade(10);
        assertEquals(10, produto.getQuantidade());
    }

    @Test
    public void testAumentarQuantidade() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        produto.aumentarQuantidade(3);
        assertEquals(8, produto.getQuantidade());
    }

    @Test
    public void testDiminuirQuantidade() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        produto.diminuirQuantidade(10);
        assertEquals(-5, produto.getQuantidade());
    }
}
