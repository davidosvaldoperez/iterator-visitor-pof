/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Letra;
import ar.com.nefre.modelo.Numero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nefre
 */
public class VisitanteSeparador implements VisitanteDeSimbolos {

    private List<Letra> letras = new ArrayList<>();
    private List<Numero> numeros = new ArrayList<>();

    @Override
    public void visitar(Letra letra) {
        letras.add(letra);
    }

    @Override
    public void visitar(Numero numero) {
        numeros.add(numero);
    }

    @Override
    public String toString() {
        return "Encontre los siguientes numeros: "
                + numeros
                + "\nY encontre las siguientes letras: "
                + letras;
    }

}
