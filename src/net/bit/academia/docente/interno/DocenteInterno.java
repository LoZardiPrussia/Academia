package net.bit.academia.docente.interno;

import net.bit.academia.docente.Docente;

public class DocenteInterno extends Docente {
    private int anzianita;

    public DocenteInterno(String nome, String cognome, int anzianita){
        super(nome, cognome);
        this.anzianita = anzianita;
    }

    public int getAnzianita() {
        return anzianita;
    }

    public void setAnzianita(int anzianita) {
        this.anzianita = anzianita;
    }

    @Override
    public double getCosto() {
        return 0;
    }
}
