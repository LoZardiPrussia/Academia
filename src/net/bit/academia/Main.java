package net.bit.academia;

import net.bit.academia.corso.edizione.EdizioneCorso;
import net.bit.academia.docente.Docente;
import net.bit.academia.docente.esterno.DocenteEsterno;
import net.bit.academia.docente.interno.DocenteInterno;

public class Main {

    public static void main(String[] args) {
        Docente[] arrDocenti= new Docente[5];
        for (int i=0; i<5 ;i++){
            if(Math.random()>0.5){
                arrDocenti[i]= new DocenteInterno("nome".concat(Integer.toString(i)),"cognome".concat(Integer.toString(i)), i+1);
            }
            else
                arrDocenti[i]= new DocenteEsterno("nome".concat(Integer.toString(i)),"cognome".concat(Integer.toString(i)),"abcdef".concat(Integer.toString(i)), 0.1+i);
        }

        EdizioneCorso mycorso= new EdizioneCorso("corso test", "informatica", 20, "avanzato", 2, arrDocenti);

        for(int i=0; i<arrDocenti.length;i++){
            System.out.println(arrDocenti[i].getNome().concat(" ").concat(arrDocenti[i].getCognome()) );
            System.out.println();
            System.out.println(arrDocenti[i].getClass());
        }
        double totale= mycorso.getCostoCorso();
        System.out.println(" Il totale del Corso sarà: "+ totale );
    }
}
