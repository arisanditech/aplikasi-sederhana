package com.example.irfan.contoh.model;

/**
 * Created by irfan on 04/12/2016.
 */

public class Halaman {
    private int GambarId;
    private String mText;
    private Pilihan mChoice1;
    private Pilihan mChoice2;
    private  boolean mApakahSelesai = false;
    public Halaman(int gambarId, String mText, Pilihan mChoice1, Pilihan mChoice2) {
        GambarId = gambarId;
        this.mText = mText;
        this.mChoice1 = mChoice1;
        this.mChoice2 = mChoice2;
    }

    public Halaman(int gambarId, String mText) {
        GambarId = gambarId;
        this.mText = mText;
        this.mChoice1 = null;
        this.mChoice2 = null;
        this.mApakahSelesai = true;
    }

    public int getGambarId() {
        return GambarId;
    }

    public boolean ismApakahSelesai() {
        return mApakahSelesai;
    }

    public void setmApakahSelesai(boolean mApakahSelesai) {
        this.mApakahSelesai = mApakahSelesai;
    }

    public int getGambarId(int aa) {
        return GambarId;
    }

    public void setGambarId(int gambarId) {
        GambarId = gambarId;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public Pilihan getmChoice1() {
        return mChoice1;
    }

    public void setmChoice1(Pilihan mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Pilihan getmChoice2() {
        return mChoice2;
    }

    public void setmChoice2(Pilihan mChoice2) {
        this.mChoice2 = mChoice2;
    }
}
