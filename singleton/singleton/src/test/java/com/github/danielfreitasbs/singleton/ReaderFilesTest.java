package com.github.danielfreitasbs.singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ReaderFilesTest {

  @Test
  public void instanciaCriada() throws InstantiationException, IllegalAccessException {
    assertTrue(ReaderFiles.getInstance() == ReaderFiles.class.newInstance());
  }
}
