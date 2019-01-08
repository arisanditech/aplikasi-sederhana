package com.example.irfan.contoh.model;

import com.example.irfan.contoh.R;

/**
 * Created by irfan on 04/12/2016.
 */

public class Vokal {

    private Halaman[] sHalaman;

    public Vokal(){
        sHalaman = new Halaman[7];
       sHalaman[0] = new Halaman(
         R.drawable.aa,
               "Haloo, %1$s  Ini adalah Huruf A",
               new Pilihan("Lanjut",1),
               new Pilihan("Balik",8)

       );
        sHalaman[1] = new Halaman(
                R.drawable.oo,
                "Haloo, %1$s  Ini adalah Huruf O",
                new Pilihan("Lanjut",2),
                new Pilihan("Balik",0)

        );

        sHalaman[2] = new Halaman(
                R.drawable.hurufi,
                "Haloo, %1$s  Ini adalah Huruf 1",
                new Pilihan("Lanjut",3),
                new Pilihan("Balik",1)

        );

        sHalaman[3] = new Halaman(
                R.drawable.uu,
                "Haloo, %1$s  Ini adalah Huruf U",
                new Pilihan("Lanjut",4),
                new Pilihan("Balik",2)

        );

        sHalaman[4] = new Halaman(
                R.drawable.ee,
                "Haloo, %1$s  Ini adalah Huruf E"
       );
    }

    public Halaman getHalaman (int pageNumber ){
        return sHalaman[pageNumber];
    }
}
