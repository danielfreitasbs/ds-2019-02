package main.java.com.github.danielfreitasbs.entity;

import java.util.Collections;
import java.util.List;

import sun.net.www.content.text.plain;

public class Sandwich{
    
    private String pao;
    private List<String> proteina;
    private List<String> salada;
    private List<String> molho;
    
    
    public static class Builder{
        private String pao;
        private List<String> proteinas;
        private List<String> saladas;
        private List<String> molhos;
        
        
        /**
        * É necessário escolher o pão para que possa ter o sanduiche.
        * @param pao String com nome do pão desejado para montar o hamburguer.
        */
        public Builder(final String pao){
            this.pao = pao;
        }
        
        public Builder proteina(final String proteina){
            proteinas.add(proteina);
            return this;
        }
        
        public Builder salada(final String salada){
            saladas.add(salada);
            return this;
        }
        
        public Builder molhos(final String molho){
            molhos.add(molho);
            return this;
        }
        
        public Sandwich build(){
            return new Sandwich(this);
        }
    }
    
    
    private Sandwich(Builder builder){
        this.pao = builder.pao;
        this.proteina = Collections.unmodifiableList(builder.proteinas);
        this.molho = Collections.unmodifiableList(builder.molhos);
        this.salada = Collections.unmodifiableList(builder.saladas);
    } 
    
    public String getPao(){
        return pao;
    }
    
    /**
    * @return List<String> return the proteina
    */
    public List<String> getProteina() {
        return proteina;
    }
    
    
    /**
    * @return List<String> return the salada
    */
    public List<String> getSalada() {
        return salada;
    }
    
    
    /**
    * @return List<String> return the molho
    */
    public List<String> getMolho() {
        return molho;
    }
    

    @Override
    public String toString(){
        final String paoPedido = "Pão: " + this.pao;
        final String pedido = String.join(" ", paoPedido, une(proteina), une(salada), une(molho), "\n");

        return pedido.trim().replaceAll(" +", " ");
    }
    

    public String une(final List<String> itens){
        return String.join("-", itens);
    }
}