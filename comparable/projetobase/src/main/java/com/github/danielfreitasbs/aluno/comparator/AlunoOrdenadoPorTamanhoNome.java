package com.github.danielfreitasbs.aluno.comparator;

import java.util.Comparator;
import com.github.danielfreitasbs.aluno.Aluno;

public class AlunoOrdenadoPorTamanhoNome implements Comparator<Aluno> {

  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    // FIXME alternativa: return Integer.compare(aluno1.getNome().length(), aluno2.getNome().length());
    // Não seria melhor, uma única linha?
    if (aluno1.getNome().length() < aluno2.getNome().length()) {
      return -1;
    } else if (aluno1.getNome().length() > aluno2.getNome().length()) {
      return 1;
    }
    return 0;
  }

}
