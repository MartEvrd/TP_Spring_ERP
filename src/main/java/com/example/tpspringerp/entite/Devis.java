package com.example.tpspringerp.entite;

import java.util.List;

public class Devis {

    private User client;
    private List<LigneDevis> lignes;

    public Devis(User client, List<LigneDevis> lignes) {
        this.client = client;
        this.lignes = lignes;
    }

    public Devis() {
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public List<LigneDevis> getLignes() {
        return lignes;
    }

    public void setLignes(List<LigneDevis> lignes) {
        this.lignes = lignes;
    }
}
