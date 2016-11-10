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

package com.Ahmet;

public class Araba {
    public int vites;
    String marka;
    private int motorGucu;
    
    Araba(){
        marka = "Fiat";
        motorGucu = 1400;
        vites=0;
    }
    
    public void goster(){
        System.out.println("marka = " + marka + " motorGucu="+motorGucu+
                " vites = "+vites);
        
    }
    
    
    
    
}
