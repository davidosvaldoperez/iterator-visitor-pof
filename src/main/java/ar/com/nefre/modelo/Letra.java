/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.modelo;

/**
 *
 * @author nefre
 */
public class Letra implements Simbolo {
    private final Character letra;

    public Letra(Character letra) {
        this.letra = letra;
    }

    @Override
    public String getStringRepresentation() {
        return String.format("Es una %s",letra);
    }

    @Override
    public String toString() {
        return letra.toString();
    }
    
    
    

}
