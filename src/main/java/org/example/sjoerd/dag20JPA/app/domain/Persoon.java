package org.example.sjoerd.dag20JPA.app.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persoon {
    @Id
    private int id;
    private String naam;
    private String email;

    public Persoon() {
    }

    public Persoon(int id, String naam, String email) {
        setId (id);
        setNaam (naam);
        setEmail (email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
