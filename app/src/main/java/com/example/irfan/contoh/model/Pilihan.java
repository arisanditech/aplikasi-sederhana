package com.example.irfan.contoh.model;

/**
 * Created by irfan on 04/12/2016.
 */

public class Pilihan {
    private String mText;
    private int  pilihanSelanjutnya;

    public Pilihan(String mText, int pilihanSelanjutnya) {
        this.mText = mText;
        this.pilihanSelanjutnya = pilihanSelanjutnya;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public int getPilihanSelanjutnya() {
        return pilihanSelanjutnya;
    }

    public void setPilihanSelanjutnya(int pilihanSelanjutnya) {
        this.pilihanSelanjutnya = pilihanSelanjutnya;
    }
}
