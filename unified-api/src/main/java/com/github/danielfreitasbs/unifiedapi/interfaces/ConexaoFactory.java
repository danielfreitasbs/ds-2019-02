package com.github.danielfreitasbs.unifiedapi.interfaces;

import java.io.File;
import com.github.danielfreitasbs.unifiedapi.factory.Conexao;

public interface ConexaoFactory {
  Conexao getInstance(String service, String user,String password);
  void createFile(String dir, String nameFile, ConexaoFactory connection, File file);
  void removeFile(String dir, String nameFile, ConexaoFactory connection);
  void updateFile(String dir, String nameFile, ConexaoFactory connection, File file);
}
