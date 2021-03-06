package br.com.conceive.POJO;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by denis on 20/12/2016.
 */

public class Arquiteto extends RealmObject implements Serializable {

    @PrimaryKey
    private int id;

    private int cau;
    @Required
    private String nome;
    @Required
    private String email;
    private String telefone;
    @Required
    private String id_google;
    private String senha;
    private String uri_foto;
    private String id_pasta_drive;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCau() {
        return cau;
    }

    public void setCau(int cau) {
        this.cau = cau;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUri_foto() {
        return uri_foto;
    }

    public void setUri_foto(String uri_foto) {
        this.uri_foto = uri_foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_google() {
        return id_google;
    }

    public void setId_google(String id_google) {
        this.id_google = id_google;
    }

    public String getId_pasta_drive() {
        return id_pasta_drive;
    }

    public void setId_pasta_drive(String id_pasta_drive) {
        this.id_pasta_drive = id_pasta_drive;
    }
}
