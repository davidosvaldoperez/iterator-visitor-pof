/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.iterator;

import ar.com.nefre.modelo.Alfabeto;
import ar.com.nefre.modelo.Simbolo;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nefre
 */
public class IteradorAlfabeto implements Iterator<Simbolo> {

    List<Simbolo> simbolos;
    Integer indice = 0;

    public IteradorAlfabeto(List<Simbolo> simbolos) {
        this.simbolos = simbolos;
    }

    @Override
    public boolean hasNext() {
        return indice < simbolos.size();
    }

    @Override
    public Simbolo next() {
        return simbolos.get(indice++);
    }

}
