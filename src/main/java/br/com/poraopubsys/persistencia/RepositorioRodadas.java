/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poraopubsys.persistencia;

import br.com.poraopubsys.entidade.Mesa;
import br.com.poraopubsys.entidade.Rodada;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcus Vinicius
 */
public interface RepositorioRodadas extends CrudRepository<Rodada, Long> {
    public List<Rodada> findByMesa(Mesa mesa); 
}
