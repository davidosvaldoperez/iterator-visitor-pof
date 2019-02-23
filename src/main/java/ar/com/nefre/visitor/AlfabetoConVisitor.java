/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Alfabeto;
import ar.com.nefre.modelo.Simbolo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nefre
 */
public class AlfabetoConVisitor extends Alfabeto {

    private final List<SimboloVisitable> simbolos;

    public AlfabetoConVisitor(SimboloVisitable... simbolos) {
        this.simbolos = Arrays.asList(simbolos);
    }
    
    @Override
    protected List<Simbolo> getSimbolos() {
        return Collections.unmodifiableList(simbolos);
    }

    public void recibir(VisitanteDeSimbolos visitador) {
        simbolos.stream().forEach(simbolo -> simbolo.aceptar(visitador));
    }

}
