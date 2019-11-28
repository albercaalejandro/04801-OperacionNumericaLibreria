/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {

    static int N1;
    static int N2;
    public final String INTRO = "OPERACIÓN NUMÉRICA";
    public final String LINEAS = "==================";
    public final String NUMERO1 = "Número 1 ....: ";
    public final String NUMERO2 = "Número 2 ....: ";
    public final String LINEAS2 = "---";
    public final String MAYOR = "El MAYOR es .: ";

    static {
        final Random RND = new Random();
        final int MAX = 10;
        final int MIN = 1;
        N1 = RND.nextInt(MAX - MIN + 1) + MIN;
        N2 = RND.nextInt(MAX - MIN + 1) + MIN;
    }

    public final void launchApp() {
         int mayor = (int) UtilesPrimitivos.operar(
                N1, N2, UtilesPrimitivos.OP_MAY);
         
        System.out.println(INTRO);
        System.out.println(LINEAS);
        System.out.println(NUMERO1+N1);
        System.out.println(NUMERO2+N2);
        System.out.println(LINEAS2);
        System.out.println(MAYOR+mayor);
    }
}
