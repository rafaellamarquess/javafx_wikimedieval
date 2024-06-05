package org.example.wikimedievalsenac.Models;

import java.time.LocalDateTime;

public class ComentarioModel {
    private String autor;
    private String texto;
    private LocalDateTime data;

    public ComentarioModel() {
    }

    public ComentarioModel(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
        this.data = LocalDateTime.now();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
