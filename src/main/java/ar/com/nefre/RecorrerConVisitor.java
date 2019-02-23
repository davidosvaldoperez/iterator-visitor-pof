/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.nefre;

import ar.com.nefre.visitor.AlfabetoConVisitor;
import ar.com.nefre.visitor.LetraVisitable;
import ar.com.nefre.visitor.NumeroVisitable;
import ar.com.nefre.visitor.VisitanteBuchon;
import ar.com.nefre.visitor.VisitanteDeSimbolos;
import ar.com.nefre.visitor.VisitanteSeparador;

/**
 *
 * @author nefre
 */
public class RecorrerConVisitor {

    public static void main(String[] args) {
        AlfabetoConVisitor alfabeto = new AlfabetoConVisitor(
                new LetraVisitable('A'),
                new LetraVisitable('B'),
                new NumeroVisitable(7),
                new LetraVisitable('C'),
                new LetraVisitable('D'),
                new NumeroVisitable(10)
        );

        System.out.println("Vamos con el visitor buchon");
        VisitanteDeSimbolos visitante = new VisitanteBuchon();
        alfabeto.recibir(visitante);
        System.out.println(visitante.toString());
        
        System.out.println("Vamos con el visitor separador");
        visitante = new VisitanteSeparador();
        alfabeto.recibir(visitante);
        System.out.println(visitante.toString());
    }
}
