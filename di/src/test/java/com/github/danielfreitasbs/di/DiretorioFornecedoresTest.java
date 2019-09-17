package com.github.danielfreitasbs.di;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import com.github.danielfreitasbs.di.fornecedores.CaldasNovas;
import com.github.danielfreitasbs.di.fornecedores.DiretorioFornecedores;
import com.github.danielfreitasbs.di.laticinios.Leite;

public class DiretorioFornecedoresTest {

  @Test
  public void estaInjetandoCorretamente() {
    DiretorioFornecedores dirFornecedor = new DiretorioFornecedores();
    Supplier<Leite> caldasNovas = new CaldasNovas();
    
    dirFornecedor.acrescenta(caldasNovas);
    assertEquals("Caldas Novas", dirFornecedor.fornecedores().get(0));
  }
}
