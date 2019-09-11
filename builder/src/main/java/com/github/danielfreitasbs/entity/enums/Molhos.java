package com.github.danielfreitasbs.entity.enums;

public enum Molhos {
  barbecue(1), tartaro(2), madeira(3);

  private final int molho;

  Molhos(final int molhoId) {
    this.molho = molhoId;
  }

  public int getMolho() {
    return molho;
  }

  @Override
  public String toString() {
    if (getMolho() == 1) {
      return "Barbecue";
    } else if (getMolho() == 2) {
      return "Tartaro";
    } else {
      return "Madeira";
    }
  }
}
