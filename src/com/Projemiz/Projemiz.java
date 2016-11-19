/*
 * Yapay Zeka ve Benzetim Sistemleri Araştırma Laboratuvarı (YAPBENZET)
 * http://yapbenzet.kocaeli.edu.tr/
 * 
 *  Nesneye Yönelik Programlama Dersi - 2016
 * 
 * Yrd. Doç. Dr. Burak İNNER
 * http://akademikpersonel.kocaeli.edu.tr/binner/
 * 
 */
package com.Projemiz;

import com.Ahmet.Araba;

public class Projemiz {

    public static void main(String[] args) {

        Araba burak = new Araba();
        // System.out.println(burak.marka);

        int X, Y, Z;
        X = 3;
        Y = 50 / X % 9;
        if ((X > Y) || (Y % 2 != 0) && (Y > 5)) {
            Z = Y % X;
        } else {
            Z = 0;
        }
        if (!(X < 4 && Y > 8)) {
            X = 3 + 2 * X;
        }
        
        System.out.println("x="+X+"y="+Y+" z="+Z);
    }
}
