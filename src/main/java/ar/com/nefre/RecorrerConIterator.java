/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre;

import ar.com.nefre.iterator.AlfabetoConIterator;
import ar.com.nefre.modelo.Letra;
import ar.com.nefre.modelo.Numero;
import ar.com.nefre.modelo.Simbolo;
import java.util.Iterator;

/**
 *
 * @author nefre
 */
public class RecorrerConIterator {

    public static void main(String[] args) {
        AlfabetoConIterator alfabeto = new AlfabetoConIterator(
                new Letra('A'),
                new Letra('B'),
                new Numero(7),
                new Letra('C'),
                new Letra('D'),
                new Numero(10)
        );

        Iterator<Simbolo> it = alfabeto.iterador();
        while (it.hasNext()) {
            Simbolo simbolo = it.next();
            System.out.println("Encontre un simbolo (no se cual tipo sin un typetest):" 
                    + simbolo.getStringRepresentation());
        }
    }

}
