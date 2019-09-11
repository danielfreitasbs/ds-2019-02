package com.github.danielfreitasbs.entity.enums;

public enum Saladas {
  tomate(1), alface(2), cebola(3);

  private final int salada;

  Saladas(final int saladaId) {
    this.salada = saladaId;
  }

  public int getSalada() {
    return salada;
  }
}
