package com.github.danielfreitasbs.singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ReaderFilesTest {

  @Test
  void instanciaCriada() throws InstantiationException, IllegalAccessException {
    assertTrue(ReaderFiles.getInstance() == ReaderFiles.class.newInstance());
  }
}
