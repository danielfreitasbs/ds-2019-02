package com.github.danielfreitasbs.unifiedapi.suppliers;

import java.io.File;
import com.github.danielfreitasbs.unifiedapi.factory.Conexao;
import com.github.danielfreitasbs.unifiedapi.interfaces.ConexaoFactory;

public class AmazonS3Api implements ConexaoFactory{

  public Conexao getInstance(String service, String user, String password) {
    // TODO Auto-generated method stub
    return null;
  }

  public void createFile(String dir, String nameFile, ConexaoFactory connection, File file) {
    // TODO Auto-generated method stub
    
  }

  public void removeFile(String dir, String nameFile, ConexaoFactory connection) {
    // TODO Auto-generated method stub
    
  }

  public void updateFile(String dir, String nameFile, ConexaoFactory connection, File file) {
    // TODO Auto-generated method stub
    
  }
}
