package com.github.danielfreitasbs.singleton;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ReaderFilesTest {

  @Test
  void naoHaComoCriarInstanciaSenaoPorMeioDeGetInstance() {
    assertThrows(IllegalAccessException.class,
            () -> ReaderFiles.class.getDeclaredConstructor().newInstance());
  }

  @Test
  void instanciaCriada() throws InstantiationException, IllegalAccessException {
    assertTrue(ReaderFiles.getInstance() == ReaderFiles.class.newInstance());
  }
}
