package com.github.danielfreitasbs.di.fornecedores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import com.github.danielfreitasbs.di.laticinios.Leite;

public class DiretorioFornecedores {
  public List<Supplier<Leite>> fornecedores;

  public void acrescenta(Supplier<Leite> fornecedor) {
    fornecedores.add(fornecedor);
  }

  public List<String> fornecedores() {
    List<String> nomesFornecedores = Collections.unmodifiableList(new ArrayList<String>());

    for (Supplier<Leite> fornecedorDeLeite : fornecedores) {
      nomesFornecedores.add(fornecedorDeLeite.get().getNomeDoFornecedor());
    }

    return nomesFornecedores;
  }

  public List<Supplier<Leite>> getFornecedores() {
    return fornecedores;
  }

}
