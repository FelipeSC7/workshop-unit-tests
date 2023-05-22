package unittests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoMutant {

    @Test
    public void testDiminuirQuantidade_mutant() {
        Produto produto = new Produto(1, "Produto A", 10.0, 5);
        // Mutante: Modificar o comportamento do método diminuirQuantidade
        // Verificar se a quantidade é diminuída incorretamente
        produto.diminuirQuantidade(10);
        assertEquals(-5, produto.getQuantidade());
    }

    @Test
    public void testAumentarQuantidade_mutant() {
        Produto produto = new Produto(1, "Produto B", 10.0, 5);
        // Mutante: Modificar o comportamento do método aumentarQuantidade
        // Verificar se a quantidade é aumentada incorretamente
        produto.aumentarQuantidade(-10);
        assertEquals(-5, produto.getQuantidade());
    }
}
