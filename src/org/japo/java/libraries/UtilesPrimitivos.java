/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class UtilesPrimitivos {

    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    public static final double operar(double n1, double n2, int op) {
        double total = 0;
        switch (op) {
            case OP_MAY:
                total = n1 > n2 ? n1 : n2;
                break;
            case OP_MEN:
                total = n1 < n2 ? n1 : n2;
                break;
            case OP_SUM:
                total = n1 + n2;
                break;
            case OP_RES:
                total = n1 - n2;
                break;
            case OP_MUL:
                total = n1 * n2;
                break;
            case OP_DIV:
                total = n1 / n2;
                break;
            case OP_MOD:
                total = n1 % n2;
                break;
            case OP_MED:
                total = (n1 + n2) / 2;
                break;
            default:

        }

        return total;
    }
}
