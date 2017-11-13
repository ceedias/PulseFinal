/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pulse.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cesardias
 */
@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
     private String email;
     
     @Temporal(TemporalType.DATE)
     private Date dt_nasc;
     
     private String senha;
     private String login;
     private int cep;
     private String rua;
     private String Estados;
     private String Comentario;
     private int cnpj;
    private int qtd_funcionarios;
    private int qtd_filiais;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstados() {
        return Estados;
    }

    public void setEstados(String Estados) {
        this.Estados = Estados;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtd_funcionarios() {
        return qtd_funcionarios;
    }

    public void setQtd_funcionarios(int qtd_funcionarios) {
        this.qtd_funcionarios = qtd_funcionarios;
    }

    public int getQtd_filiais() {
        return qtd_filiais;
    }

    public void setQtd_filiais(int qtd_filiais) {
        this.qtd_filiais = qtd_filiais;
    }

    public int getQtd_filhos() {
        return qtd_filhos;
    }

    public void setQtd_filhos(int qtd_filhos) {
        this.qtd_filhos = qtd_filhos;
    }

    public int getQtd_cigarros() {
        return qtd_cigarros;
    }

    public void setQtd_cigarros(int qtd_cigarros) {
        this.qtd_cigarros = qtd_cigarros;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private int qtd_filhos;
    private int qtd_cigarros;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.pulse.entity.Pessoa[ id=" + id + " ]";
    }
    
}
