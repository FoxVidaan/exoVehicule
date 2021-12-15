package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicule {
    protected String couleur;
    protected Float poids;

    public Vehicule() {
    }

    @Autowired
    public Vehicule(String couleur, Float poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Float getPoids() {
        return poids;
    }

    public void setPoids(String Float) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "couleur='" + couleur + '\'' +
                ", poids='" + poids + '\'' +
                '}';
    }
}
