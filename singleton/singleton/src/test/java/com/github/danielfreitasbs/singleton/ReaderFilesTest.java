package com.github.danielfreitasbs.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReaderFilesTest {

  @Test
  void naoHaComoCriarInstanciaSenaoPorMeioDeGetInstance() {
    assertThrows(IllegalAccessException.class,
            () -> ReaderFiles.class.getDeclaredConstructor().newInstance());
  }

  @Test
  void instanciaCriada() {
    assertSame(ReaderFiles.getInstance(), ReaderFiles.getInstance());
  }
}
