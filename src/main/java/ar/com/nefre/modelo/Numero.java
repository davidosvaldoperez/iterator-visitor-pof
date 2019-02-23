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
public class Numero implements Simbolo {

    Integer numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String getStringRepresentation() {
        return String.format("Es un %s", numero);
    }

    @Override
    public String toString() {
        return numero.toString();
    }

}
