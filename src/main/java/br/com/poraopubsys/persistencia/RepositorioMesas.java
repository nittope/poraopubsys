/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.persistencia;

import br.com.poraopubsys.entidade.Mesa;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinicius
 */
public interface RepositorioMesas extends CrudRepository<Mesa, Long> {
    
    public Mesa findByNome (String nome);
   
}
