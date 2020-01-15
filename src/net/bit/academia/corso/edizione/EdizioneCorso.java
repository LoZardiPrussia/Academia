package net.bit.academia.corso.edizione;

import net.bit.academia.corso.Corso;
import net.bit.academia.docente.Docente;

import java.util.Date;

public class EdizioneCorso extends Corso {
    private int edizione;
    private Date inizio;
    private Date fine;
    private String sede;
    private Docente[] professori;

    public EdizioneCorso(String titolo, String area, int nLezioni, String livello, int edizione, Docente[] docenti){
        super(titolo, area, nLezioni, livello);
        this.edizione = edizione;
        this.professori= docenti;
       /* for(int i = 0; i < docenti.length; i++){
            this.professori[i] = docenti[i];
        }*/
    }

    public double getCostoCorso(){
        double tot=0.0;
        for(int i=0;i<professori.length;i++){
            tot+=professori[i].getCosto();
        }
        return tot;
    }

}
