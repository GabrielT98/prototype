import org.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(1, "Produto Original", 9.0);

        Produto produtoClone = produto.clone();
        produtoClone.setId(2);
        produtoClone.setNome("Produto Clonado");;

        assertEquals("Produto{id=1, nome='Produto Original', preço=9.0}",produto.toString());
        assertEquals("Produto{id=2, nome='Produto Clonado', preço=9.0}", produtoClone.toString());
    }
}
