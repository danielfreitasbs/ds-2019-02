package com.github.danielfreitasbs.di.laticinios;

public class Leite {

  private String nomeDoFornecedor;

  public Leite(String fornecedor) {
    this.nomeDoFornecedor = fornecedor;
  }

  public String getNomeDoFornecedor() {
    return nomeDoFornecedor;
  }
}
