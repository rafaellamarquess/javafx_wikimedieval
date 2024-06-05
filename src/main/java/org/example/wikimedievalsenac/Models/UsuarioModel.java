package org.example.wikimedievalsenac.Models;

import java.util.ArrayList;
import java.util.List;

public class UsuarioModel {
    private String nome;
    private String email;
    private String senha;
    private List<MidiaModel> midias;
    private List<ComentarioModel> comentarioModels;

    public UsuarioModel() {
        this.midias = new ArrayList<>();
        this.comentarioModels = new ArrayList<>();
    }

    public UsuarioModel(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.midias = new ArrayList<>();
        this.comentarioModels = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<MidiaModel> getMidias() {
        return midias;
    }

    public void adicionarMidia(MidiaModel midia) {
        this.midias.add(midia);
    }

    public List<ComentarioModel> getComentarios() {
        return comentarioModels;
    }

    public void adicionarComentario(ComentarioModel comentarioModel) {
        this.comentarioModels.add(comentarioModel);
    }

    public boolean fazerLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public List<MidiaModel> buscarMidia(String titulo) {
        List<MidiaModel> resultados = new ArrayList<>();
        for (MidiaModel midia : midias) {
            if (midia.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(midia);
            }
        }
        return resultados;
    }
}
