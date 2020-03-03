/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablo.mylib;

/**
 *
 * @author pablo
 */
public class LibClass {

    public static String acrostic(String[] args) {
        System.out.println("Primer cambio de Javier");
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > i) {
                b.append(args[i].charAt(i));
            } else {
                b.append('?');
            }
        }
        return b.toString();
    }
}
