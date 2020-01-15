package net.bit.academia.docente.esterno;

import net.bit.academia.docente.Docente;

public class DocenteEsterno extends Docente {
    private String partitaIVA;
    private double costoH;

    public DocenteEsterno(String nome, String cognome, String partitaIVA, double costoH){
        super(nome, cognome);
        this.partitaIVA = partitaIVA;
        this.costoH = costoH;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public void setCostoH(double costoH) {
        this.costoH = costoH;
    }

    @Override
    public double getCosto() {
        return this.costoH;
    }


}
