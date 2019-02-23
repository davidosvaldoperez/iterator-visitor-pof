/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.iterator;

import ar.com.nefre.modelo.Alfabeto;
import ar.com.nefre.modelo.Simbolo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nefre
 */
public class AlfabetoConIterator extends Alfabeto {

    private final List<Simbolo> simbolos;

    public AlfabetoConIterator(Simbolo... simbolos) {
        this.simbolos = Arrays.asList(simbolos);
    }

    @Override
    protected List<Simbolo> getSimbolos() {
        return Collections.unmodifiableList(simbolos);
    }

    public Iterator<Simbolo> iterador() {
        return new IteradorAlfabeto(getSimbolos());
    }

}
