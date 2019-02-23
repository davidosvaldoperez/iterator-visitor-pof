/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Numero;

/**
 *
 * @author nefre
 */
public class NumeroVisitable extends Numero implements SimboloVisitable {

    public NumeroVisitable(Integer numero) {
        super(numero);
    }

    @Override
    public void aceptar(VisitanteDeSimbolos visitante) {
        visitante.visitar(this);
    }

}
