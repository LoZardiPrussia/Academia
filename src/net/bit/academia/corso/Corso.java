package net.bit.academia.corso;

public class Corso {
    private String titolo;
    private String area;
    private int nLezioni;
    private String livello;

    public Corso(String titolo, String area, int nLezioni, String livello){
        this.titolo = titolo;
        this.area = area;
        this.nLezioni = nLezioni;
        this.livello = livello;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getnLezioni() {
        return nLezioni;
    }

    public void setnLezioni(int nLezioni) {
        this.nLezioni = nLezioni;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }
}
