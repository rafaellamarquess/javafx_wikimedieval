package org.example.wikimedievalsenac.Models;


public class MidiaModel {
    private String titulo;
    private String tipo;
    private int anoLancamento;
    private String sinopse;

    public MidiaModel() {
    }

    public MidiaModel(String titulo, String tipo, int anoLancamento, String sinopse) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.anoLancamento = anoLancamento;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
