/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Letra;
import ar.com.nefre.modelo.Numero;

/**
 *
 * @author nefre
 */
public class VisitanteBuchon implements VisitanteDeSimbolos {

    private int cantNumeros = 0;
    private int cantLetras = 0;

    @Override
    public void visitar(Letra letra) {
        cantLetras++;
        System.out.println("Encontre una Letra:"
                + letra.getStringRepresentation());
    }

    @Override
    public void visitar(Numero numero) {
        cantNumeros++;
        System.out.println("Encontre un Numero:"
                + numero.getStringRepresentation());
    }

    @Override
    public String toString() {
        return "Numeros=" + cantNumeros + ", Letras=" + cantLetras;
    }

}
