package com.github.danielfreitasbs.equals;

public class NumeroTelefonico {

  private String codigoPais;
  private String codigoEstado;
  private String numeroDoTelefone;
  
  
  /**
   * @param codigoPais
   * @param codigoEstado
   * @param numeroDoTelefone
   */
  public NumeroTelefonico(String codigoPais, String codigoEstado, String numeroDoTelefone) {
    super();
    this.codigoPais = codigoPais;
    this.codigoEstado = codigoEstado;
    this.numeroDoTelefone = numeroDoTelefone;
  }
  
  public String getCodigoPais() {
    return codigoPais;
  }
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }
  public String getCodigoEstado() {
    return codigoEstado;
  }
  public void setCodigoEstado(String codigoEstado) {
    this.codigoEstado = codigoEstado;
  }
  public String getNumeroDoTelefone() {
    return numeroDoTelefone;
  }
  public void setNumeroDoTelefone(String numeroDoTelefone) {
    this.numeroDoTelefone = numeroDoTelefone;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigoEstado == null) ? 0 : codigoEstado.hashCode());
    result = prime * result + ((codigoPais == null) ? 0 : codigoPais.hashCode());
    result = prime * result + ((numeroDoTelefone == null) ? 0 : numeroDoTelefone.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NumeroTelefonico other = (NumeroTelefonico) obj;
    if (codigoEstado == null) {
      if (other.codigoEstado != null)
        return false;
    } else if (!codigoEstado.equals(other.codigoEstado))
      return false;
    if (codigoPais == null) {
      if (other.codigoPais != null)
        return false;
    } else if (!codigoPais.equals(other.codigoPais))
      return false;
    if (numeroDoTelefone == null) {
      if (other.numeroDoTelefone != null)
        return false;
    } else if (!numeroDoTelefone.equals(other.numeroDoTelefone))
      return false;
    return true;
  }
  
  
}
