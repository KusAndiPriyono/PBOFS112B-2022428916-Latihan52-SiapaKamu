package com.mycompany.pbofs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void siapaKamu() {
        System.out.println("Saya Manusia");
    }
}
