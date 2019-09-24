package com.github.danielfreitasbs.autoclosable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClasseCriadaTest {

  @BeforeAll
  static void setup() throws IOException {
    Files.createFile(Paths.get("teste.txt"));
  }
  
  @Test
  void verificaCloseChamado() {
    Throwable excecao = assertThrows(RuntimeException.class, () -> {
      try (ClasseCriada obj = new ClasseCriada("teste.txt")) {
      }
    });
    assertEquals("método close chamado", excecao.getMessage());
  }
}
