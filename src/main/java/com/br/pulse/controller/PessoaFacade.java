/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pulse.controller;

import com.br.pulse.entity.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cesardias
 */
@Stateless
public class PessoaFacade extends AbstractFacade<Pessoa> {

    @PersistenceContext(unitName = "com.br_Pulse_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PessoaFacade() {
        super(Pessoa.class);
    }
    
}
