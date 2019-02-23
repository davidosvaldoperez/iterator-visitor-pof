/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Letra;

/**
 * @author nefre
 */
public class LetraVisitable extends Letra implements SimboloVisitable {

    public LetraVisitable(Character letra) {
        super(letra);
    }

    @Override
    public void aceptar(VisitanteDeSimbolos visitante) {
        visitante.visitar(this);
    }

}
