/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sonaglichristianverifica;

import java.util.Objects;

/**
 *
 * @author sonagli.christian
 */
public class Prodotto {
    private String nome;
    private double peso;
    private double prezzo;
    private int numPezzi;
    
    /**
     * 
     * @param nome nome del prodotto
     * @param peso peso del prodotto
     * @param prezzo prezzo del prodotto
     * @param numPezzi quantità disponibile del prodotto
     */
    public Prodotto(String nome, double peso, double prezzo, int numPezzi)
    {
        this.nome = nome;
        this.peso = peso;
        this. prezzo = prezzo;
        this.numPezzi = numPezzi;
    }
    
    /**
     * 
     * @return metodo getter per restituire il nome
     */
    public String getNome()
    {
        return nome;
    }
    
    /**
     * 
     * @param num paramentro in input per chiedere quanti prodotti devono essere venduti
     */
    public void vendiProdotto(int num)
    {
        if (num <= numPezzi && num > 0)
        {
            numPezzi = numPezzi - num;
        }
    }
    
    /**
     * 
     * @param num paramentro in input per chiedere quanti prodotti devono essere riforniti
     */
    public void rifornisci(int num)
    {
        if (num > 0)
        {
            numPezzi = numPezzi + num;
        }
    }
    
    /**
     * @return restituisce le informazioni sul prodotto
     */
    public String toString()
    {
        return "Nome: " + nome + " peso: " + peso + "Kg prezzo: €" + prezzo  + " prodotti presenti: " + numPezzi;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        return hash;
    }
/**
 * 
 * @param obj parametro object in input con la classe da confrontare
 * @return restituisce un boolean se le classi hanno lo stesso attributo nome
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
}
