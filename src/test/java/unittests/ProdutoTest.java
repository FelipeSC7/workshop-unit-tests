package unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Disabled("Desabilitado para testes")
	@Test
    public void testGetId() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        assertEquals(1, produto.getId());
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
