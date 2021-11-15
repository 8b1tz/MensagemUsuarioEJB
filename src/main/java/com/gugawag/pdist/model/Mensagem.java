package com.gugawag.pdist.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensagem {

    @Id
    private Long id;
    private String texto;

    public Mensagem() {
    }

    public Mensagem(long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
