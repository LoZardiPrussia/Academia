package net.bit.academia.docente;

import java.util.Date;

public abstract class Docente {
    private String nome;
    private String cognome;
    private Date datadinascita;
    private String[] skills;
    private boolean esterno = false;

    public Docente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract double getCosto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDatadinascita() {
        return datadinascita;
    }

    public void setDatadinascita(Date datadinascita) {
        this.datadinascita = datadinascita;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        for(int i = 0; i < skills.length; i++){
            this.skills[i] = skills[i];
        }
    }

    public boolean isEsterno() {
        return esterno;
    }

    public void setEsterno(boolean esterno) {
        this.esterno = esterno;
    }
}
