package com.github.danielfreitasbs.entity;

import java.util.Collections;
import java.util.List;
import com.github.danielfreitasbs.entity.enums.Molhos;
import com.github.danielfreitasbs.entity.enums.Pao;
import com.github.danielfreitasbs.entity.enums.Proteinas;
import com.github.danielfreitasbs.entity.enums.Saladas;


public class Sandwich {

  // TODO NÃ£o deveria ser um Enum em vez de String? Resultaria em design melhor.
  // private String pao;
  private Pao pao;

  // TODO mesma consideracao do item anterior e para os seguintes. String nÃ£o ajuda muito aqui.
  private List<Proteinas> proteina;
  private List<Saladas> salada;
  private List<Molhos> molho;


  public static class Builder {
    private Pao pao;
    private List<Proteinas> proteinas;
    private List<Saladas> saladas;
    private List<Molhos> molhos;


    /**
     * Ã‰ necessÃ¡rio escolher o pÃ£o para que possa ter o sanduiche.
     * 
     * @param pao String com nome do pÃ£o desejado para montar o hamburguer.
     */
    public Builder(final Pao pao) {
      this.pao = pao;
    }

    public Builder proteina(final Proteinas proteina) {
      proteinas.add(proteina);
      return this;
    }

    public Builder salada(final Saladas salada) {
      saladas.add(salada);
      return this;
    }

    public Builder molhos(final Molhos molho) {
      molhos.add(molho);
      return this;
    }

    public Sandwich build() {
      return new Sandwich(this);
    }
  }


  private Sandwich(Builder builder) {
    this.pao = builder.pao;
    this.proteina = Collections.unmodifiableList(builder.proteinas);
    this.molho = Collections.unmodifiableList(builder.molhos);
    this.salada = Collections.unmodifiableList(builder.saladas);
  }

  public Pao getPao() {
    return pao;
  }

  /**
   * @return List<String> return the proteina
   */
  public List<Proteinas> getProteina() {
    return proteina;
  }


  /**
   * @return List<String> return the salada
   */
  public List<Saladas> getSalada() {
    return salada;
  }


  /**
   * @return List<String> return the molho
   */
  public List<Molhos> getMolho() {
    return molho;
  }


  @Override
  public String toString() {
    final String paoPedido = "PÃ£o: " + this.pao;
    final String pedido = String.join(" ", paoPedido, uneProteinas(proteina), uneSaladas(salada),
        uneMolhos(molho), "\n");

    // TODO esta Ã© uma linha que merece comentÃ¡rio, pensava ter colocado.
    return pedido.trim().replaceAll(" +", " ");
  }

  // TODO Essa de longe não é a melhor solução, mas não consegui pensar em outra.
  public String uneProteinas(final List<Proteinas> itens) {
    StringBuilder nomesProteinas = new StringBuilder();

    for (Proteinas proteina : itens) {
      nomesProteinas.append(proteina).append(" - ");
    }

    return nomesProteinas.toString();
  }

  // TODO Essa de longe não é a melhor solução, mas não consegui pensar em outra.
  public String uneSaladas(final List<Saladas> itens) {
    StringBuilder nomesSaladas = new StringBuilder();

    for (Saladas salada : itens) {
      nomesSaladas.append(salada).append(" - ");
    }

    return nomesSaladas.toString();
  }

  // TODO Essa de longe não é a melhor solução, mas não consegui pensar em outra.
  public String uneMolhos(final List<Molhos> itens) {
    StringBuilder nomesMolhos = new StringBuilder();

    for (Molhos molho : itens) {
      nomesMolhos.append(molho).append(" - ");
    }

    return nomesMolhos.toString();
  }


}
