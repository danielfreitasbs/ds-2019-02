package com.github.danielfreitasbs.unifiedapi.factory;

public class Conexao {
  private static Conexao INSTANCE = new Conexao();

  private Conexao() {}

  public static Conexao getInstance() {
    return INSTANCE;
  }
}
