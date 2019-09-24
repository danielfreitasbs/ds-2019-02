package com.github.danielfreitasbs.autoclosable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClasseCriada extends FileInputStream{

  public ClasseCriada(String name) throws FileNotFoundException {
    super(name);
  }

  @Override
  public void close() {
    throw new RuntimeException("método close chamado");
  }
}
