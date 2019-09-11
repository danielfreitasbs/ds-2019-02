package com.github.danielfreitasbs.entity.enums;

public enum Proteinas {
  frango(1), bovina(2), suina(3);
  
  private final int proteina;
  
  Proteinas(final int proteinaId){
    this.proteina = proteinaId;
  }
  
  public int getProteina() {
    return proteina;
  }
  
}
