package com.mycompany.pbofs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        d.setNip("41227829930");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        System.out.println();
        
        mhs.setNim("2022428916");
        mhs.setNama("Kus Andi Priyono");
        mhs.setUmur(26);
        mhs.setKelas("FS112B");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
