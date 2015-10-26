/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.persistencia;

import br.com.poraopubsys.entidade.Rodada;
import br.com.poraopubsys.entidade.Venda;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinicius
 */
public interface RepositorioVendas extends CrudRepository<Venda, Long> {
    
    public Venda findByRodada(Rodada rodada);
}
