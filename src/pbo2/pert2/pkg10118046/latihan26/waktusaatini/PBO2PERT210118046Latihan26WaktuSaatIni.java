/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat waktu hari ini
 */
public class PBO2PERT210118046Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date waktu = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id"));
        String hasil = dateFormat.format(waktu);
        System.out.println("Hari ini adalah hari : " + hasil);
       
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
