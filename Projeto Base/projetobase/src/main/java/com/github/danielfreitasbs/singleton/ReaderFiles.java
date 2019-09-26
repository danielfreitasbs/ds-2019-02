package com.github.danielfreitasbs.singleton;

/**
 * Esta é uma classe exemplo de leitura de arquivos onde é aplicado o padrão Singleton.
 * 
 * @author danielfreitabs
 *
 */
public class ReaderFiles {

  /**
   * Este atributo cria uma instancia da classe assim que o programa é iniciado na JVM.
   */
  private static ReaderFiles INSTANCIA = new ReaderFiles();

  /**
   * Restrição para instanciação da classe. Dessa forma, somente ReaderFiles, pode controlar a
   * instanciação.
   */
  private ReaderFiles() {

  }

  /**
   * Retorna a instancia da classe que foi criada quando o programa foi iniciado.
   * 
   * @return instancia da classe ReaderFiles.
   */
  public static ReaderFiles getInstance() {
    return INSTANCIA;
  }

}
