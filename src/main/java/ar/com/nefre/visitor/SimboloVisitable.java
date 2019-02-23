/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.visitor;

import ar.com.nefre.modelo.Simbolo;

/**
 *
 * @author nefre
 */
public interface SimboloVisitable extends Simbolo {

    public void aceptar(VisitanteDeSimbolos visitante);
}
