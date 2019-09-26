package com.github.danielfreitasbs.equals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class NumeroTelefonicoTest {

  @Test
  public void testaContains() {
    NumeroTelefonico numero = new NumeroTelefonico("55", "62", "981613234");

    Set<NumeroTelefonico> collection = new HashSet<NumeroTelefonico>();

    collection.add(numero);

    NumeroTelefonico outroNumero = new NumeroTelefonico("55", "62", "981613234");

    assertTrue(collection.contains(outroNumero));
    
  }
  
  @Test
  public void testaEquals() {
    NumeroTelefonico numero = new NumeroTelefonico("55", "62", "981613234");
    
    Set<NumeroTelefonico> collection = new HashSet<NumeroTelefonico>();
    
    collection.add(numero);
    
    NumeroTelefonico outroNumero = new NumeroTelefonico("55", "62", "981613234");
    assertTrue(numero.equals(outroNumero));
  }
}

