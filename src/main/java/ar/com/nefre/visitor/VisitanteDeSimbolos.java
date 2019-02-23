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
public interface VisitanteDeSimbolos {
    public void visitar(Letra letra);
    public void visitar(Numero numero);
}
