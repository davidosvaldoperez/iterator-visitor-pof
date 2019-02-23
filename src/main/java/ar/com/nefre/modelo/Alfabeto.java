/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nefre
 */
public abstract class Alfabeto {

    protected abstract List<Simbolo> getSimbolos();
    
    @Override
    public String toString(){
        return getSimbolos().stream()
                .map(Object::toString)
                .reduce(String::concat)
                .get();
    }

}
