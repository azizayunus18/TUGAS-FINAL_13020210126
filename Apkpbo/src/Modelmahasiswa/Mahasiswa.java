
package Modelmahasiswa;

import java.util.logging.Logger;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int uh;
    private int uts;
    private int uas;
    private float rata;
    private String kompetensi;

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getUh() {
        return uh;
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }

    public float getRata() {
        return rata;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUh(int uh) {
        this.uh = uh;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

    public void setRata(float rata) {
        this.rata = rata;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

}