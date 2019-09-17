package com.github.danielfreitasbs.di.fornecedores;

import java.util.function.Supplier;
import com.github.danielfreitasbs.di.laticinios.Leite;

public class CaldasNovas implements Supplier<Leite> {

  @Override
  public Leite get() {
    return new Leite("Caldas Novas");
  }

}
