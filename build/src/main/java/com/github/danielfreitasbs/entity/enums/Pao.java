package com.github.danielfreitasbs.entity.enums;

public enum Pao {

  gergelim(1), tresQueijos(2), frances(3);

  private int pao;

  Pao(final int paoId) {
    this.pao = paoId;
  }
  
  public int getPao() {
    return this.pao;
  }
}
